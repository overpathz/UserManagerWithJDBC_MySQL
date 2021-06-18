package com.pathz.UserManager.servlets;

import com.pathz.UserManager.database.DBHandler;
import com.pathz.UserManager.database.Repository;
import com.pathz.UserManager.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/getUser")
public class GetOneUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println(Repository.getUser(request.getParameter("name")).getUsername());
        } catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}