package com.pathz.UserManager.util;

public class PathIdParser {
    public static int parse(String requestPath) {
        String[] pathParts = requestPath.split("/");
        return Integer.parseInt(pathParts[1]);
    }
}
