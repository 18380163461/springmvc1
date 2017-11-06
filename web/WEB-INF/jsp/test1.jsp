<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: pd
  Date: 2017/11/2
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <%= 'a' + 1 %>
    <% out.print("my name is youpengda");%>
    <br>
    <% out.print(new Date());%>


</head>
<body>
<br>
<c:set var="name" value="this is my value"></c:set>
name=${name}<br>
<br>
</body>
</html>
