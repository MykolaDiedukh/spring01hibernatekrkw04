<%--
  Created by IntelliJ IDEA.
  User: soul
  Date: 7/18/20
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>lista ksiazek</title>
</head>
<body>
<h1>Ksiazki w bazie</h1>
<ul>
    <c:forEach items="${books}" var="b">
        <li>${b.title}, ${b.description},
            AUTHORS: <c:forEach items="${b.authors}" var="a">${a.fullName}, </c:forEach></li>
    </c:forEach>
</ul>
</body>
</html>