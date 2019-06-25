package com.stackroute.Exercise1;

public class NumberSeries {

    public static String printLoop(int num) {
        String result = "";
        Integer.parseInt(String.valueOf(num));
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                result = result + i;
            }
        }
        return result;
    }
}