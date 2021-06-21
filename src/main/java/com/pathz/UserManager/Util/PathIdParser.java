package com.pathz.UserManager.Util;

import java.util.Arrays;

public class PathIdParser {
    public static int parse(String requestPath) {
        String[] pathParts = requestPath.split("/");
        return Integer.parseInt(pathParts[1]);
    }
}
