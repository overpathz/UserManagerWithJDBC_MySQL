package com.pathz.UserManager.testing;

import at.favre.lib.crypto.bcrypt.BCrypt;
import at.favre.lib.crypto.bcrypt.BCryptParser;
import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.Util.EncryptVerify;
import com.pathz.UserManager.models.User;

import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String clearPassword = "qwerty";
        String hashedPassword = "$2a$12$ibYy5UyojnF7Va2zi5u7q.OKYZYr9ZJxfWWdLa.LE8psbTX4QDnGS";
    }
}
