<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Sign In</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_style.css" />
    </head>

    <body>

    <% String message = (String) request.getAttribute("incorrect_data"); %>

        <div class="form-wrap">
            <form action="/login" method="post">
                <h1>Sign In</h1>
                <input type="text" placeholder="Username" id="username" name="username">
                <input type="password" placeholder="Password" id="password" name="password">
                <input type="submit" id="sub_btn" value="Sign In">
            </form>

            <% if (message != null) { %>
            <p id="message"><%=message%></p>
            <% } %>

            <p class="register"> If you dont have an account, <a class="register" href="/register"><b>Register</b></a></p>

        </div>

    </body>
</html>