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
        $("button").click(
            function () {

                $.ajax({
                    url: "myControllerZhu/testStudent",
                    data: {
                        name: "尤鹏达",
                        age: "shiba"
                    },
                    success: function (data) {
                        alert("aa");
                       /* var json=eval("("+data")");
                        alert(json.name);*/
                       alert(data);
                    }

                });
            }
        );
    });
</script>
<body>
$ENDyoupegda1$

<br>
<button>提交Ajx</button>
</body>
</html>
