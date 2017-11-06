<%--
  Created by IntelliJ IDEA.
  User: pd
  Date: 2017/10/25
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>welcome </title>
    <base href="<%=basePath%>">
</head>
<body>

<form action="myControllerZhu/canshuUser" method="post">
    姓名：<input type="text" name="name" value="${name}"><br>
    年龄：<input type="text" name="age" value="${age}"><br>
    地址：<input type="text" name="address.dizhi"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
