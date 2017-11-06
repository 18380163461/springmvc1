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

<form action="myControllerZhu/uploadFile" method="post" enctype="multipart/form-data">
    <p>
        选择文件:<input type="file" name="multipartFile">
    <p>
        选择文件:<input type="file" name="multipartFile">
    <p>
        选择文件:<input type="file" name="multipartFile">
    <p>
        <input type="submit" value="提交">
</form>

</body>
</html>
