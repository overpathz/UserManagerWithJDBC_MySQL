package com.pathz.UserManager.database;

import java.sql.*;

public class DBHandler extends Configs {

    public Connection getConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Connection connection;
        String connectingQuery = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(connectingQuery, dbUser, dbPass);

        return connection;
    }
}
