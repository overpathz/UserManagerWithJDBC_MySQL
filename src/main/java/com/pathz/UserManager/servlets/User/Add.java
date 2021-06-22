package com.pathz.UserManager.servlets.User;

import com.pathz.UserManager.DAO.UserDAO;

import com.pathz.UserManager.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user_crud_interface/addingUser.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);

        try {
            if (!UserDAO.isExistWithName(user)) {
                UserDAO.insertUser(user);
                response.sendRedirect("/users");
            } else {
                request.setAttribute("already_exist", "User is already exist!");
                request.getRequestDispatcher("user_crud_interface/addingUser.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}
