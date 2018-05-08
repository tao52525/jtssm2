<%--
  Created by IntelliJ IDEA.
  User: 01367391
  Date: 2018/5/7
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${userList}" var="item" varStatus="vs">
    <p>${item.id}</p>
</c:forEach>
</body>
</html>
