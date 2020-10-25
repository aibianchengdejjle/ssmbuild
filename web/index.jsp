<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/20 0020
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style type="text/css">
       a{
         text-decoration: none;
         color: black;
         font-size: 18px;

       }
        h{
          width: 200px;
          height: 50px;
          margin: 100px auto;
          text-align: center;
          line-height: 38px;
          background: aqua;
          border-radius: 4px;
        }
  </style>
  <body>
  <h1>
    <a href="${pageContext.request.contextPath}/book/allbook">点击进入列表页</a>
  </h1>
  <a href="${pageContext.request.contextPath}/user/login1">登陆</a>
  <a href="${pageContext.request.contextPath}/user/main1">主页</a>

  </body>
</html>
