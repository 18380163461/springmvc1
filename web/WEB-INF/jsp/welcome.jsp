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
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>welcome </title>
    <script type="text/javascript">
        document.ready = function (callback) {
            alert(<%='A'+'B'%>);
        }
    </script>
</head>
<body>
111111111111
<br>
${requestScope.message}
<br>
<br>
<br><br><br>

<img  width="33%" alt="no pic" src="<%=basePath%>images/pic_1.jpg">
<<br>
<a href="<%='A'+'B'%>"> 欢迎页面</a>

</body>
</html>
