package com.pathz.UserManager.testing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/home1")
public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        String text = request.getParameter("text");

        Cookie colorCookie = new Cookie("color", color);
        Cookie textCookie = new Cookie("text", text);

        response.addCookie(textCookie);
        response.addCookie(colorCookie);

        response.sendRedirect(request.getContextPath() + "/home");

    }
}
