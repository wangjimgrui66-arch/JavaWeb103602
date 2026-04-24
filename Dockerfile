FROM tomcat:9-jdk11-corretto

# 1. 先把项目所有文件复制到容器里
COPY . /app/
WORKDIR /app

# 2. 把 webapp 里的文件强制复制到 Tomcat 的 ROOT 目录
RUN cp -r src/main/webapp/* /usr/local/tomcat/webapps/ROOT/

# 3. 给根目录加一个自动跳转的 index.html，直接跳转到登录页
RUN echo '<html><head><meta charset="utf-8"><script>window.location.href="login.htm"</script></head></html>' > /usr/local/tomcat/webapps/ROOT/index.html

# 4. 暴露端口并启动 Tomcat
EXPOSE 8080
CMD ["catalina.sh", "run"]