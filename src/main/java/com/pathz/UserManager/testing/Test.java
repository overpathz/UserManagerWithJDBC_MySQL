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
        String clearPassword = "123";
        String hashedPassword = "$2a$12$BBccn.l3zb.WiLny1A0UXuuDwun7xx8TBgSnqk.aw5Ho8Vc4f/G/e";

        String hashedRepeat = EncryptVerify.encryptPassword(clearPassword);


        System.out.println(BCrypt.verifyer().verify(clearPassword.getBytes(StandardCharsets.UTF_8), hashedRepeat.getBytes(StandardCharsets.UTF_8)).verified);
    }
}
