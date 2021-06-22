package com.pathz.UserManager.servlets.RegLog;

import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("log_reg/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);

        try {
            if (UserDAO.verifyUser(user)) {
                HttpSession session = request.getSession();
                session.setAttribute("name", username);
                response.sendRedirect("/users");

            } else {
                System.out.println("DENIED");
                response.sendRedirect("/login");
            }

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}
