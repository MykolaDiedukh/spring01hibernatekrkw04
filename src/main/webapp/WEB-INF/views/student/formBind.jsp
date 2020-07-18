<%--
  Created by IntelliJ IDEA.
  User: soul
  Date: 7/5/20
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form unbinded</title>
</head>
<body>
<form:form method="post" modelAttribute="student">
    <div>
        <label for="firstName">First name</label>
        <form:input id="firstName" path="firstName" type="text"/>
    </div>
    <div>
        <label for="lastName">Last name</label>
        <form:input id="lastName" path="lastName" type="text"/>
    </div>
    <div>
        Male: <form:radiobutton path="gender" value="M"/><br>
        Female: <form:radiobutton path="gender" value="F"/>
    </div>
    <div>
        <form:select path="country">
            <form:option value="-" label="--Please Select--"/>
            <form:options items="${allCountry}"/>
        </form:select>
    </div>
    <div>
        <label for="notes">Notes</label><br>
        <form:textarea id="notes" path="notes" rows="5" cols="30"/>
    </div>
    <div>
        <form:checkboxes path="mailingList" items="${mailList}"
                         />
    </div>
    <div>
        <input type="submit">
    </div>
</form:form>
</body>
</html>
