package com.pathz.UserManager.testing;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.pathz.UserManager.DAO.UserDAO;
import com.pathz.UserManager.Util.EncryptVerify;
import com.pathz.UserManager.models.User;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        User user = new User("yarik", "serw");
        String hashedPasswordInDB = EncryptVerify.encryptPassword(user.getPassword());
        System.out.println(hashedPasswordInDB);

        System.out.println(EncryptVerify.verifyPassword(user.getPassword(), hashedPasswordInDB));
    }
}
