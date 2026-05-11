package org.example;

public class StringUtilities {

    // Returns true if string length is less than 5
    public static boolean shortString(String str) {
        return str.length() < 5;
    }

    // Returns first character of string
    public static char firstLetter(String str) {
        return str.charAt(0);
    }

    // Replaces "asparagus" with ****
    public static String censorAsparagus(String str) {
        return str.replace("asparagus", "****");
    }

    // Returns longer string
    public static String bigger(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }
}