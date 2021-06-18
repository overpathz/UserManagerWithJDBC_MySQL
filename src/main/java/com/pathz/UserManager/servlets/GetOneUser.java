package com.pathz.UserManager.servlets;

import com.pathz.UserManager.database.DBHandler;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/getUser")
public class GetOneUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBHandler dbHandler = new DBHandler();
        try {
            dbHandler.getUsers().stream().filter(x->x.getUsername().equals(request.getParameter("name"))).forEach(x-> System.out.println(x.getUsername()));
        } catch (SQLException | IllegalAccessException | InstantiationException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}