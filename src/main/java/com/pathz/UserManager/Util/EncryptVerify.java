package com.pathz.UserManager.Util;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class EncryptVerify {

    public static String encryptPassword(String password) {
        if (password.equals("") || password == null) {
            return "";
        }
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    public static boolean verifyPassword(String password, String encryptedPassword) {
        return BCrypt.verifyer().verify(password.toCharArray(), encryptedPassword).verified;
    }

}
