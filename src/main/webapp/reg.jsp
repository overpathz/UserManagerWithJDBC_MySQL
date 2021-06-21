<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <style>
        *{margin: 0; padding: 0;}
        body{background: #ecf1f4; font-family: sans-serif;}

        .form-wrap{ border-radius: 25px; width: 320px; background: #3e3d3d; padding: 40px 20px; box-sizing: border-box; position: fixed; left: 50%; top: 30%; transform: translate(-50%, -50%);}
        h1{text-align: center; color: #fff; font-weight: normal; margin-bottom: 20px;}

        body {
            background: #2b2a2a;
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

        .already_reg {
            margin-bottom: 10px;
            margin-top: 10px;
            color: white;
            font-size: 15px;
            text-decoration: none;
        }

        #sub_btn {
            background: #2b2a2a;
            transition: 1s;
        }

        #sub_btn:hover {
            background: #1e1d1d;
            transition: 1s;
        }
    </style>

    <body>

        <% String message = (String) request.getAttribute("pswds_not_same"); %>
        <% request.setAttribute("pswds_not_same", "pswds_not_same"); %>

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