<%@ page import="com.pathz.UserManager.models.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update user</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/upd_user.css" />
</head>

<body>

<% User user = (User) request.getAttribute("user"); %>

<div class="form-wrap">
    <form action="/update" method="post">
        <h1>Update user</h1>
        <input type="text" placeholder="Username" id="username" name="username" value="${user.getUsername()}">
        <input type="password" placeholder="New password" id="password" name="password">

        <input type="hidden" id="id" name="id" value="${user.getId()}">
        <input type="submit" id="sub_btn" value="Update">
    </form>
</div>

<br>
<br>

<div align="center">
    <a href="/users" class="back"><p>Back to main page..</p></a>
</div>

</body>
</html>