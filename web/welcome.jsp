<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/25 0025
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>love</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/Style.css"/>
    <script type="text/javascript">
        /* if(top.location!=self.location){
              top.location=self.location;
         } */
    </script>
</head>
<body style=" background: url(http://global.bing.com/az/hprichbg/rb/RavenWolf_EN-US4433795745_1920x1080.jpg) no-repeat center center fixed; background-size: 100%;">
    <form class="loginForm" action="${pageContext.request.contextPath }/user1/gomain"  name="actionForm" id="actionForm"  method="get" >
        <div class="info">${error }</div>
        <div class="inputbox">
            <label for="userCode">用户名：</label>
            <input type="text" class="input-text" id="userCode" name="username" placeholder="请输入用户名" required/>
        </div>
        <div class="inputbox">
            <label for="userPassword">密码：</label>
            <input type="password" id="userPassword" name="password" placeholder="请输入密码" required/>
        </div>
        <div class="subBtn">
            <input type="submit" value="登录"/>
            <input type="reset" value="重置"/>
        </div>
    </form>
</body>
</html>