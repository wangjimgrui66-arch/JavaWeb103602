<%--
  Created by IntelliJ IDEA.
  User: 王景瑞
  Date: 2026/4/25
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--JSP网页的身份象征--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>这个网页要接收后端发回的数据school</h1>
<%=request.getAttribute("school")%>
<%--JSP的语法--%>
</body>
</html>
