<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center"><%= "User Management" %></h1>

    <br>

    <form action="/addUser" method="post">
        <label for="username"></label>
        <input type="text" name="username" id="username">

        <br>

        <label for="password"></label>
        <input type="password" name="password" id="password">

        <br>
        <input type="submit" value="Добавить">
    </form>

</body>
</html>