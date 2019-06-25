package com.stackroute.Exercise1;

public class RepeatSubString {
    public static String finalOutputString(String word1,int number1) {
        int len=word1.length();
        String str1=word1.substring(len-number1,len);
        return word1.concat(str1.repeat(number1));
    }
}
