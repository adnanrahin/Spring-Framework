<%--
  Created by IntelliJ IDEA.
  User: adnan
  Date: 6/2/2020
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<h2>Student Form</h2>

<br><br>

<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
    <br><br>

    Country:
    <form:select path="country">?
        <form:options items="${student.countries}"/>
    </form:select>
    <br><br>

    Favorite Language:
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
    Python <form:radiobutton path="favoriteLanguage" value="Python"/>
    MySQL <form:radiobutton path="favoriteLanguage" value="MySQL"/>
    <br><br>
    Operating System:
    Linux <form:checkbox path="operatingSystem" value="Linux"/>
    Windows <form:checkbox path="operatingSystem" value="Windows"/>
    <br><br>

    <input type="submit" value="Submit">
</form:form>

<br><br>

</body>
</html>
