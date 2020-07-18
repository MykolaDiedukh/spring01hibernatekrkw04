<%--
  Created by IntelliJ IDEA.
  User: soul
  Date: 7/5/20
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form unbinded</title>
</head>
<body>

<form:form method="post" modelAttribute="person">

    <div>
        <label for="login">Login</label>
        <form:input id="login" path="login" type="text"/>
    </div>

    <div>
        <label for="email">Email</label>
        <form:input id="email" path="email" type="email"/>
    </div>

    <div>
        <label for="password">Password</label>
        <form:input id="password" path="password" type="password"/>
    </div>

    <div>
        <input type="submit">
    </div>

</form:form>

</body>
</html>
