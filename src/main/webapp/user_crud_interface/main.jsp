<%@ page import="com.pathz.UserManager.models.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pathz.UserManager.dao.UserDAO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Main</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main_style.css" />

</head>
<body>
    <h1 id="header" align="center">User Control Panel</h1>
    <br>

    <h2 align="center">List of users</h2>

    <div align="center">
        <form action="/add" method="get">
            <input  id="add_user_button" type="submit" value="Add new user">
        </form>
    </div>

    <br>

    <% List<User> userList = UserDAO.selectAllUsers();
        request.setAttribute("userList", userList);
    %>

    <c:if test="${!empty userList}">
        <table align="center" border="1px gray" style="border-collapse: collapse">
            <tr>
                <th width="80">ID</th>
                <th width="250">Username</th>
                <th width="100">Edit</th>
                <th width="100">Delete</th>
            </tr>

            <c:forEach var="user" items="${userList}" >
                <tr align="center">
                    <td>${user.getId()}</td>
                    <td>${user.getUsername()}</td>
                    <td>
                        <form action="/edit" method="get">
                            <input type="submit" value="Edit">
                            <input type="hidden" value="${user.getId()}" id="id" name="id">
                        </form>
                    </td>
                    <td>
                        <form action="/remove/${user.getId()}" method="get">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </c:if>

</body>
</html>


