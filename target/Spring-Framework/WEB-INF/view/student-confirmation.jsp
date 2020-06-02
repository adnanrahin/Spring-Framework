<%--
  Created by IntelliJ IDEA.
  User: adnan
  Date: 6/2/2020
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

<h2>Student Confirmation Page</h2>

<br><br>

First Name: ${student.firstName}
<br><br>
Last Name: ${student.lastName}
<br><br>
Country Name: ${student.country}
<br><br>
Favorite Programming Language: ${student.favoriteLanguage}

<br><br>

Operating System:

<ul>

    <c:forEach var="temp" items="${student.operatingSystem}">
        <li>${temp}</li>
    </c:forEach>

</ul>

</body>
</html>
