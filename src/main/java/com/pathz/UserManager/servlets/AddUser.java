package com.pathz.UserManager.servlets;

import com.pathz.UserManager.database.DBHandler;
import com.pathz.UserManager.database.Repository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Repository.addUser();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException throwables) {
            throwables.printStackTrace();
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        requestDispatcher.forward(request, response);

    }
}
