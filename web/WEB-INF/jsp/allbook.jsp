<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/20 0020
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
      <div class="row-clearfix">
          <div class="col-md-12 colum">
              <div class="page-header">
                  <h1>
                      <small>书籍列表-----书籍展示</small>
                  </h1>
              </div>
          </div>
      </div>
<%--      新增书籍界面--%>
      <div class="row">
          <div class="col-md-4 column">
              <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
          </div>
          <div class="col-md-4 column">
              <form action="" method="post" style="float: left">
                  <input type="text" name="bookName" class="form-inline" placeholder="查询书籍">
                  <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/queryBookName">查询</a>
              </form>
          </div>
      </div>
      <div class="row clearfix">
          <div class="col-md-12 column">
              <table class="table table-hover table-striped">
                  <thead>
                  <tr>
                      <th>书籍编号</th>
                      <th>书籍名字</th>
                      <th>书籍数量</th>
                      <th>书籍详情</th>
                      <th>操作</th>
                  </tr>
                  </thead>
                  <tbody>
                  <c:forEach var="book" items="${list}">
                      <tr>
                          <td>${book.bookID}</td>
                          <td>${book.bookName}</td>
                          <td>${book.bookCounts}</td>
                          <td>${book.detail}</td>
                          <td>
                              <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.getBookID()}">更改</a> |
                              <a href="${pageContext.request.contextPath}/book/toDelete/${book.getBookID()}">删除</a>
                          </td>
                      </tr>
                  </c:forEach>
                  </tbody>
              </table>
          </div>
      </div>
  </div>
</body>
</html>
