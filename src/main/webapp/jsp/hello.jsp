<%--
  Created by IntelliJ IDEA.
  User: zhuba
  Date: 2020/6/10
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tbody>
<c:forEach items="${books}" var="book">
    <tr>
        <td><c:out value="${book.name}"></c:out></td>
        <td><c:out value="${book.author}"></c:out></td>
        <td><c:out value="${book.publish}"></c:out></td>
        <td><c:out value="${book.isbn}"></c:out></td>
        <td><c:out value="${book.price}"></c:out></td>
        <c:if test="${book.state==1}">
            <td><a href="lendbook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-primary btn-xs">借阅</button></a></td>
        </c:if>
        <c:if test="${book.state==0}">
            <td><a href="returnbook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-primary btn-xs">归还</button></a></td>
        </c:if>
        <td><a href="bookdetail.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-success btn-xs">详情</button></a></td>
        <td><a href="updatebook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-info btn-xs">编辑</button></a></td>
        <td><a href="deletebook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-danger btn-xs">删除</button></a></td>
    </tr>
</c:forEach>
</tbody>
</body>
</html>
