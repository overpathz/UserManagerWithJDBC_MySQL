package com.pathz.UserManager;

import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.models.User;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        User user = new User("test2", "sfsf");
        boolean ss = UserDAO.isExist(user);
        System.out.println(ss);
    }
}
