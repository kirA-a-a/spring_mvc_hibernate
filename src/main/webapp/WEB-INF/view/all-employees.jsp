<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllEmployees</title>
</head>
<body>

<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Департамент</th>
        <th>Зарплата</th>
        <th>Операции</th>
    </tr>
    <c:forEach var="emp" items="${allEmployees}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Обновить" onclick="window.location.href = '${updateButton}'"/>
                <input type="button" value="Удалить" onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<input type="button" value="Добавить"
       onclick="window.location.href = 'addNewEmployee'">

</body>
</html>
