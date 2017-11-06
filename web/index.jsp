<%--
  Created by IntelliJ IDEA.
  User: pd
  Date: 2017/10/25
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>$Title$</title>
    <base href="<%=basePath%>">
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        /*alert("123456789")*/
        <%--alert(<%='A'+'B'%>);--%>
    });
</script>
<body>
$ENDyoupegda1$

<br>
<a href="my.do2"> 欢迎页面</a>
</body>
</html>
