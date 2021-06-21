package com.pathz.UserManager.DAO;

import com.pathz.UserManager.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private final String dbURL = "jdbc:mysql://localhost:3306/user_manager";
    private final String dbUser = "root";
    private final String dbPassword = "root";

    private static final String INSERT_INTO_USER_SQL = "INSERT INTO user" + " (username, password) VALUES " + "(?,?);";
    private static final String SELECT_USER_BY_ID = "select id, name, password from user where id =?;";
    private static final String SELECT_ALL_USERS = "select * from user;";
    private static final String DELETE_ALL_USERS = "delete from user where id = ?;";
    private static final String UPDATE_ALL_USERS = "update user set name = ?, password = ? where id = ?;";

    protected Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection;
        String connectingQuery = dbURL + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(connectingQuery, dbUser, dbPassword);

        return connection;
    }

    public void insertUser(User user) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_USER_SQL);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(1, user.getUsername());
    }

}
