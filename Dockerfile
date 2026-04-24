# 直接用官方 Tomcat 镜像
FROM tomcat:9-jdk11-corretto

# 把你的 webapp 目录复制到 Tomcat 的 ROOT 应用下
COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

# Tomcat 默认端口是 8080，Render 要求监听 10000 端口，所以我们改一下
RUN sed -i 's/8080/10000/g' /usr/local/tomcat/conf/server.xml

EXPOSE 10000
CMD ["catalina.sh", "run"]