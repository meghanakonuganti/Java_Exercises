package com.stackroute.Exercise1;

/*
Reads unspecified number of integer arguments using Scanner class and adds them together.
 */

public class ScannersIntegers {

    public static int readIntegersAndAddThem(int[] inputNumbers) {
        int sumOfNumbers = 0;
        int inputNumber;
        int i=0;
        while((inputNumber = inputNumbers[i]) != 0) {
            sumOfNumbers = sumOfNumbers + inputNumber;
            i++;
        }
        return sumOfNumbers;
    }
}