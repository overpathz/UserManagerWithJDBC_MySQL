package com.pathz.UserManager.servlets.User;


import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.Util.PathIdParser;
import com.pathz.UserManager.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/update/*")
public class Update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get method in update");
        request.getRequestDispatcher("updatingUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post method in update");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int id = PathIdParser.parse(request.getPathInfo());

        User user = new User(id, username, password);

        try {
            if (!UserDAO.isExist(user)) {
                UserDAO.updateUser(user);
                response.sendRedirect("/users");
            } else {
                request.setAttribute("user_not_exist", "This user does not exist!");
                request.getRequestDispatcher("updatingUser.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}