# 构建阶段：使用带 Maven 的 Java 17 镜像
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# 复制 pom.xml 并下载依赖（缓存层）
COPY pom.xml .
RUN mvn dependency:go-offline -B

# 复制源码并打包
COPY src ./src
RUN mvn clean package -DskipTests

# 运行阶段：使用 Eclipse Temurin 官方镜像（替代 openjdk:17-jdk-slim）
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# 复制构建好的 war 包
COPY --from=build /app/target/*.war app.war

# Render 要求监听 10000 端口
EXPOSE 10000

# 启动命令
ENTRYPOINT ["java", "-jar", "app.war", "--server.port=10000"]