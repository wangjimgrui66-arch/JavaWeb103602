# 用 Tomcat 镜像
FROM tomcat:9-jdk11-corretto

# 把你的 webapp 目录复制到 Tomcat 根目录
COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

# 给 Tomcat 根目录加一个跳转文件，自动跳转到 login.htm
RUN echo '<html><head><script>window.location.href="login.htm"</script></head></html>' > /usr/local/tomcat/webapps/ROOT/index.html

# 端口不改，就用默认的 8080，Render 会自动映射
EXPOSE 8080
CMD ["catalina.sh", "run"]