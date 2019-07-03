package com.stackroute.Exercise1;

public class ReverseString {
    //program to reverse the given string
    public static String reverse(String word) {
        char[] reverse = word.toCharArray();
        String reverseword = "";
        for (int i = reverse.length-1; i>=0; i--)
            reverseword = reverseword + reverse[i];
        return reverseword;
    }

}
