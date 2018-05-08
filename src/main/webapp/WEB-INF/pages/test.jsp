<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 01367391
  Date: 2018/5/7
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
    <c:forEach items="${userList}" var="item" varStatus="vs">
        <h1>${item.id}</h1>
    </c:forEach>
</body>
</html>
