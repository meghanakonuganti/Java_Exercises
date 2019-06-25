package com.stackroute.Exercise1;

public class CharacterCheck {
    public static String check(String word1) {
        String str="";
        int len = word1.length();
        int i;
        for (i = 0; i < len; i++) {
            char ch = word1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                str=str.concat("Vowel");
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                str=str.concat("Consonant");
            else
                str=str.concat("Digit");
        }
        return str;
    }
}