package com.pathz.UserManager;

import at.favre.lib.crypto.bcrypt.BCrypt;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet{
    public static void main(String[] args) {
        String password1 = "kazaki12";
        String password = "kazaki14";
        String hashPswd = encryptPassword(password);
        System.out.println(hashPswd);
        System.out.println();
        System.out.println(verifyPassword(password1, hashPswd));
    }

    private static String encryptPassword(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    private static boolean verifyPassword(String password, String encryptedPassword) {
        return BCrypt.verifyer().verify(password.toCharArray(), encryptedPassword).verified;
    }
}