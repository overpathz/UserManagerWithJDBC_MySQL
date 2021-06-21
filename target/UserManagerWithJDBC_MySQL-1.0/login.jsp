<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Sign In</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <style>
        *{margin: 0; padding: 0;}
        body{background: #ecf1f4; font-family: sans-serif;}

        .form-wrap{ border-radius: 25px; width: 320px; background: #0e1423; padding: 40px 20px; box-sizing: border-box; position: fixed; left: 50%; top: 30%; transform: translate(-50%, -50%);}
        h1{text-align: center; color: #fff; font-weight: normal; margin-bottom: 20px;}

        body {
            background: #294761;
        }

        input{width: 100%; background: none; border: 1px solid #fff; border-radius: 3px; padding: 6px 15px; box-sizing: border-box; margin-bottom: 20px; font-size: 16px; color: #fff;}

        input[type="button"]{ background: #bac675; border: 0; cursor: pointer; color: #3e3d3d;}
        input[type="button"]:hover{ background: #a4b15c; transition: .6s;}

        ::placeholder{color: #fff;}

        #message {
            margin-bottom: 15px;
            color: #6aa9ff;
            font-size: 20px;
        }

        .register {
            margin-bottom: 10px;
            margin-top: 10px;
            color: white;
            font-size: 15px;
            text-decoration: none;
        }

        #sub_btn {
            background: #d3f3ff;
            transition: 1s;
            color: #0e1423;
            font-weight: bold;
        }

        #sub_btn:hover {
            background: #1e1d1d;
            transition: 1s;
            color: #d3f3ff;
            font-weight: bold;
        }
    </style>

    <body>

        <% String message; %>
        <%  %>

        <div class="form-wrap">
            <form action="/login" method="post">
                <h1>Sign In</h1>
                <input type="text" placeholder="Username" id="username" name="username">
                <input type="password" placeholder="Password" id="password" name="password">
                <input type="submit" id="sub_btn" value="Sign In">
            </form>


            <p class="register"> If you dont have an account, <a class="register" href="/register"><b>Register</b></a></p>

        </div>

    </body>
</html>