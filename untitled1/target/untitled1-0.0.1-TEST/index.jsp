<!-- index.jsp -->

<%--
  Created by IntelliJ IDEA.
  User: wangxun
  Date: 2023/1/12
  Time: 下午16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
    <head>
        <title>index.jsp</title>
        <script src="/js/jquery-3.6.3.js"></script>
<%--        <script>--%>
<%--            if(typeof jquery !='undefined')--%>
<%--            {--%>
<%--                alert("jQuery success")--%>
<%--            }else--%>
<%--            {--%>
<%--                alert("jQuery fail")--%>
<%--            }--%>
<%--        </script>--%>
    </head>
    <body>
        <hr>
        <p>Day01</p>
        <a href="${pageContext.request.contextPath}/demo1/action.action">访问服务器1</a>
        <a href="${pageContext.request.contextPath}/demo2/action.action">访问服务器2</a>

        <h2>分别用get和post方式访问服务器</h2>
        <form action="${pageContext.request.contextPath}/ReqAction/req.action" method="get">
            <input type="submit" value="get方式提交">
        </form>
        <form action="${pageContext.request.contextPath}/ReqAction/req.action" method="post">
            <input type="submit" value="post方式提交">
        </form>
        <hr>
        <p>Day02</p>
        <h2>SpringMVC中获取前端提交数据的5种方式</h2>
        <h2>方式1：单个数据的获取方式</h2>
        <form action="${pageContext.request.contextPath}/dataSubmit/submit01.action" method="get">
            姓名:<input type="text" name="name"><br>
            年龄:<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>

        <h2>方式2：封装成实体类进行获取</h2>
        <form action="${pageContext.request.contextPath}/dataSubmit/submit02.action" method="get">
            姓名:<input type="text" name="name"><br>
            年龄:<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>

        <h2>方式3：动态占位符获取提交的数据(只可以用在超链接或地址栏)</h2>
        <!-- 携带的数据放在.action之前，用斜杠分隔开-->
        <a href="${pageContext.request.contextPath}/dataSubmit/submit03.action/xun/22">动态占位符获取提交数据</a>

        <h2>方式4：参数名称不一致时接收数据</h2>
        <form action="${pageContext.request.contextPath}/dataSubmit/submit04.action" method="get">
            姓名:<input type="text" name="name"><br>
            年龄:<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>

        <h2>方式5：手工获取前端提交的数据</h2>
        <form action="${pageContext.request.contextPath}/dataSubmit/submit05.action" method="get">
            姓名:<input type="text" name="name"><br>
            年龄:<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>

        <hr>
        <p>Day03</p>
        <!--SpringMVC 03: 请求和响应的乱码解决 + SpringMVC响应Ajax请求-->
        <a href="javascript:showTest()">发送ajax请求，测试</a><br>
        <div id="testDiv">调试</div>
        <a href="javascript:showUser()">发送ajax请求，获取用户信息列表</a><br>
        <div id="userDiv">div，用来显示服务器返回的数据</div>



        <script type="text/javascript">
            function showTest() {
                //使用jQuery封装的ajax()发送ajax消息
                $.ajax({
                    url:"${pageContext.request.contextPath}/ajaxrequest/test.action",
                    type:"get",
                    dataType:"json",
                    success:function (strTest) {
                        var data = strTest

                        //将拼接好的数据回显在div中
                        $("#testDiv").html(data)
                    }
                })
            }
        </script>

        <script type="text/javascript">
            function showUser() {
                //使用jQuery封装的ajax()发送ajax消息
                $.ajax({
                    url:"${pageContext.request.contextPath}/ajaxrequest/list.action",
                    type:"get",
                    dataType:"json",
                    success:function (userList) {
                        console.log(typeof userList)
                        userList = eval(userList)
                        console.log(userList.length)
                        console.log(typeof userList)
                        console.log(userList)
                        var data = ""
                        $.each(userList, function (i,user){
                            data += user.username +"——" + user.userage + "<br>"
                        })
                        //将拼接好的数据回显在div中
                        $("#userDiv").html(data)
                    }
                })
            }
        </script>

        <h2>4种转发和重定向的方式</h2>
        <hr>
        <p>Day04</p>
        <%--4种转发和重定向的方式--%>
        <a href="${pageContext.request.contextPath}/JumpActionOne.action">1.普通转发页面(对请求的默认处理方式)</a><br><br>

        <a href="${pageContext.request.contextPath}/JumpActionTwo.action">2.action转发页面</a><br><br>

        <a href="${pageContext.request.contextPath}/JumpActionThree.action">3.普通重定向页面</a><br><br>

        <a href="${pageContext.request.contextPath}/JumpActionFour.action">4.action重定向页面</a>

        <hr>
        <p>Day05</p>
        <form action="${pageContext.request.contextPath}/DirectWithData/JumpWithData.action?name=forward"  method="get">
            <input type="submit" value="带数据跳转">
        </form>
        <form action="${pageContext.request.contextPath}/DirectWithData/RedirectWithData.action?name=redirect"  method="get">
            <input type="submit" value="带数据重定向">
        </form>
    </body>
</html>