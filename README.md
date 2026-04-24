# 🚀 JavaWeb103602

## 📖 项目简介

JavaWeb103602 是一个基于 Java Web 技术开发的基础 Web
应用，实现了用户注册、登录等核心功能。项目采用 Servlet + JSP 架构，结合
MySQL 数据库完成数据持久化。

------------------------------------------------------------------------

## 🧱 技术栈

-   Java / Servlet
-   JSP / HTML
-   MySQL
-   JDBC
-   Maven
-   Tomcat

------------------------------------------------------------------------

## 📂 项目结构

    JavaWeb103602
    ├── src/main/java/com/yckj/servlet
    │   ├── AddUserServlet.java
    │   ├── LoginServlet.java
    │   └── HelloServlet.java
    ├── src/main/webapp
    │   ├── index.jsp
    │   ├── login.html
    │   ├── regist.html
    │   └── WEB-INF/web.xml
    ├── pom.xml

------------------------------------------------------------------------

## ✨ 功能

-   用户注册
-   用户登录
-   数据库交互（JDBC）
-   基础请求处理

------------------------------------------------------------------------

## ⚙️ 环境

-   JDK 8+
-   Tomcat 8+
-   MySQL 5.7+

------------------------------------------------------------------------

## 🚀 运行步骤

1.  克隆项目

```{=html}
<!-- -->
```
    git clone https://github.com/wangjimgrui66-arch/JavaWeb103602.git

2.  创建数据库

```{=html}
<!-- -->
```
    CREATE TABLE user (
      id INT PRIMARY KEY AUTO_INCREMENT,
      username VARCHAR(50),
      password VARCHAR(50)
    );

3.  部署到 Tomcat

4.  访问

```{=html}
<!-- -->
```
    http://localhost:8080/JavaWeb103602

------------------------------------------------------------------------

## 🎯 项目亮点

-   完整实现登录注册流程
-   掌握 Servlet 请求处理
-   JDBC 数据库操作

------------------------------------------------------------------------

## 📈 优化方向

-   Session 登录控制
-   MVC 分层
-   Spring Boot 重构

------------------------------------------------------------------------

## 👨‍💻 作者

https://github.com/wangjimgrui66-arch
