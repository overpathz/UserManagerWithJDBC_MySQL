package com.pathz.UserManager.servlets;

import com.pathz.UserManager.database.DBHandler;
import com.pathz.UserManager.database.Repository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/getUsers")
public class GetUsers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Repository.getUsers().stream().forEach(x-> System.out.println(x.getUsername()));
        } catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
