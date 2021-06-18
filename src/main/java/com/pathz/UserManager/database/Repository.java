package com.pathz.UserManager.database;

import com.pathz.UserManager.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Repository extends Configs {
    private static Connection connection;

    private static Connection getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new DBHandler().getConnection();
    }

    public static void addUser(String username, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERNAME + "," + Const.USER_PASSWORD + ") values(?, ?)";

        PreparedStatement prSt = getConnection().prepareStatement(insert);
        prSt.setString(1, username);
        prSt.setString(2, password);
        prSt.executeUpdate();
    }

    public static List<User> getUsers() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        List<User> userList = new ArrayList<>();
        Map<String, String> map = getUsersMap();

        map.forEach((key, value) -> userList.add(new User(key, value)));

        return userList;
    }

    private static Map<String, String> getUsersMap() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Map<String, String> listWithUsernames = new HashMap<>();

        Statement statement = getConnection().createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM users");

        while (results.next()) {
            String username;
            String password;

            username = results.getString("username");
            password = results.getString("password");

            listWithUsernames.put(username, password);
        }

        return listWithUsernames;
    }

    public static User getUser(String username) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return getUsers().stream().filter(x->x.getUsername().equals(username)).collect(Collectors.toList()).get(0);
    }
}
