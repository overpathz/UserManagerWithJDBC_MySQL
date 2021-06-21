package com.pathz.UserManager.DAO;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.pathz.UserManager.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private static final String dbURL = "jdbc:mysql://localhost:3306/user_manager";
    private static final String dbUser = "root";
    private static final String dbPassword = "root";

    private static final String INSERT_INTO_USER_SQL = "INSERT INTO user" + " (username, password) VALUES " + "(?,?);";
    private static final String SELECT_USER_BY_ID = "select id, name, password from user where id =?;";
    private static final String SELECT_ALL_USERS = "select * from user;";
    private static final String DELETE_ALL_USERS = "delete from user where id = ?;";
    private static final String UPDATE_ALL_USERS = "update user set name = ?, password = ? where id = ?;";

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection;
        String connectingQuery = dbURL + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(connectingQuery, dbUser, dbPassword);

        return connection;
    }

    public static void insertUser(User user) throws ClassNotFoundException, SQLException {
        String hashPassword = encryptPassword(user.getPassword());

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_USER_SQL);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, hashPassword);
        preparedStatement.executeUpdate();
    }

    private static String encryptPassword(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    private static boolean verifyPassword(String password, String encryptedPassword) {
        return BCrypt.verifyer().verify(password.toCharArray(), encryptedPassword).verified;
    }

}
