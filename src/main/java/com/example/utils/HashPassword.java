package com.example.utils;

import org.mindrot.jbcrypt.BCrypt;

public class HashPassword {
    
    public static String createSecurePassword(String password) {
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt(7));
        return hashPassword;
    }

    public static boolean compareSecurePassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
