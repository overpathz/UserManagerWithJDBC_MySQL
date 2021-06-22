<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reg_style.css" />
    </head>

    <body>

        <% String message = (String) request.getAttribute("req_message"); %>

        <div class="form-wrap">
            <form action="/register" method="post">
                <h1>Sign Up</h1>
                <input type="text" placeholder="Username" id="username" name="username">
                <input type="password" placeholder="Password" id="password" name="password">
                <input type="password" placeholder="Confirm Password" id="confirm_pswd" name="confirm_pswd">

                <% if (message != null) { %>
                    <p id="message"><%=message%></p>
                <% } %>

                <input type="submit" id="sub_btn" value="Sign Up">
            </form>

            <p class="already_reg"> If you're already registered: <a class="already_reg" href="/login"><b>Login</b></a></p>

        </div>

    </body>
</html>