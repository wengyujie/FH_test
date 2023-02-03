<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/1
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>跳转后页面</h3>
    <hr>
    <p>跳转时携带的数据</p>
        HttpServletRequest:${request}<br>
        HttpSession:${session}<br>
        Model:${model}<br>
        ModelMap:${modelmap}<br>
        map:${map}<br>
    <hr>
    <p>跳转前发送的数据</p>
        param:${param.name}
</body>
</html>
