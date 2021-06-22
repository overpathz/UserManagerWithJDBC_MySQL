<%@ page import="com.pathz.UserManager.models.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update user</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<style>
    *{margin: 0; padding: 0;}
    body{background: #ecf1f4; font-family: sans-serif;}

    .form-wrap{ border-radius: 25px; width: 320px; background: #a60400; padding: 40px 20px; box-sizing: border-box; position: fixed; left: 50%; top: 30%; transform: translate(-50%, -50%);}
    h1{text-align: center; color: #fff; font-weight: normal; margin-bottom: 20px;}

    body {
        background: #3c0400;
    }

    input{width: 100%; background: none; border: 1px solid #fff; border-radius: 3px; padding: 6px 15px; box-sizing: border-box; margin-bottom: 20px; font-size: 16px; color: #fff;}

    input[type="button"]{ background: #bac675; border: 0; cursor: pointer; color: #3e3d3d;}
    input[type="button"]:hover{ background: #a4b15c; transition: .6s;}

    ::placeholder{color: #fff;}

    #message {
        margin-bottom: 15px;
        color: #ffffff;
        font-size: 20px;
    }


    #sub_btn {
        background: #7e1608;
        transition: 1s;
    }

    #sub_btn:hover {
        background: #551006;
        transition: 1s;
    }

    .back {
        text-decoration: none;
        color: white;
    }
</style>

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