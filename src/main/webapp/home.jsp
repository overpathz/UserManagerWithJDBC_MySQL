<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <span style="color: ${cookie.color.value}">Hello</span>

    <form method="post" action="/home">
        <label for="color">
            <select name="color" id="color">
                <option value="red">Красный</option>
                <option value="black">Черный</option>
                <option value="orange">Оранжевый</option>
            </select>
        </label>

        <br>
        <br>

        <input type="submit" value="Send">
    </form>


</body>
</html>
