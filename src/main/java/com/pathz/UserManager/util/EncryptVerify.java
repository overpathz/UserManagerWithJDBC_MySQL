package com.pathz.UserManager.util;

import at.favre.lib.crypto.bcrypt.BCrypt;

import java.nio.charset.StandardCharsets;

public class EncryptVerify {
    
    public static String encryptPassword(String password) {
        
        if (password.equals("")) {
            return "";
        }
        
        return BCrypt.withDefaults()
            .hashToString(12, password.toCharArray());
    }

    public static boolean verifyPassword(String password, String encryptedPassword) {
        return BCrypt.verifyer()
            .verify(password.toCharArray(), 
                    encryptedPassword.getBytes(StandardCharsets.UTF_8))
            .verified;
    }
}
