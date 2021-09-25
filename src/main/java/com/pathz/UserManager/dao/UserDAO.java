package com.pathz.UserManager.dao;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.pathz.UserManager.util.EncryptVerify;
import com.pathz.UserManager.models.User;

import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String dbURL = "jdbc:mysql://localhost:3306/user_manager";
    private static final String dbUser = "root";
    private static final String dbPassword = "root";

    private static final String INSERT_INTO_USER = "INSERT INTO user" + " (username, password) VALUES " + "(?,?);";
    private static final String SELECT_USER_BY_ID = "select id, username, password from user where id =?;";
    private static final String SELECT_ALL_USERS = "select * from user;";
    private static final String DELETE_USER = "delete from user where id = ?;";
    private static final String UPDATE_USER = "update user set username = ?, password = ? where id = ?;";
    private static final String FIND_USER_BY_USERNAME = "select * from user where username = ?;";

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection;
        String connectingQuery = dbURL + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(connectingQuery, dbUser, dbPassword);

        return connection;
    }

    public static void insertUser(User user) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_USER);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.executeUpdate();
    }

    public static boolean updateUser(User user) throws SQLException, ClassNotFoundException {
        boolean rowUpdated;

        String hashPassword = EncryptVerify.encryptPassword(user.getPassword());

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);

        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, hashPassword);
        preparedStatement.setInt(3, user.getId());

        rowUpdated = preparedStatement.executeUpdate() > 0;

        return rowUpdated;
    }

    public static User selectUser(int id) throws SQLException, ClassNotFoundException {
        User user = null;

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            user = new User(id, username, password);
        }

        return user;
    }

    public static List<User> selectAllUsers() throws SQLException, ClassNotFoundException {
        List<User> userList = new ArrayList<>();

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String surname = resultSet.getString("username");
            String password = resultSet.getString("password");
            int id = resultSet.getInt("id");
            User user = new User(id, surname, password);
            userList.add(user);
        }

        return userList;
    }

    public static boolean deleteUser(int id) throws SQLException, ClassNotFoundException {
        boolean rowDeleted;

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);

        preparedStatement.setInt(1, id);

        rowDeleted = preparedStatement.executeUpdate() > 0;

        return rowDeleted;
    }

    public static boolean isExistWithName(User user) throws SQLException, ClassNotFoundException {
        return selectAllUsers().stream().anyMatch(user1 -> user1.getUsername().equals(user.getUsername()));
    }

    public static boolean verifyUser(User user) throws SQLException, ClassNotFoundException {
        boolean theSameUsernames = isExistWithName(user);
        boolean theSamePasswords;

        User userDB = findUserByUsername(user.getUsername());

        byte[] userPassword = user.getPassword().getBytes(StandardCharsets.UTF_8);
        byte[] userDBPassword = userDB.getPassword().getBytes(StandardCharsets.UTF_8);

        theSamePasswords = BCrypt.verifyer().verify(userPassword, userDBPassword).verified;

        return (theSamePasswords && theSameUsernames);
    }

    private static User findUserByUsername(String username) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_USERNAME);

        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        User user = null;

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String foundUsername = resultSet.getString("username");
            String password = resultSet.getString("password");
            user = new User(id, foundUsername, password);
        }

        return user;
    }
}
