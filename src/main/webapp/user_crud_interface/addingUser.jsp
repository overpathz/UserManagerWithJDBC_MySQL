<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add user</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/add_user.css" />
</head>

<body>

<% String message = (String) request.getAttribute("already_exist"); %>

<div class="form-wrap">
    <form action="/add" method="post">
        <h1>Add new user</h1>
        <input type="text" placeholder="Username" id="username" name="username">
        <input type="password" placeholder="Password" id="password" name="password">

        <% if (message != null) { %>
        <p id="message"><%=message%></p>
        <% } %>

        <input type="submit" id="sub_btn" value="Add">
    </form>
</div>

<br>
<br>

<div align="center">
    <a href="/users" class="back"><p>Back to main page..</p></a>
</div>

</body>
</html>