package com.pathz.UserManager.servlets;

import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.Util.EncryptVerify;
import com.pathz.UserManager.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("reg.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_pswd");

        String encryptedPassword = EncryptVerify.encryptPassword(password);

        User user = new User(username, encryptedPassword);

        try {
            if (UserDAO.isExist(user)) {
                System.out.println("Такой пользователь уже существует!");
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}
