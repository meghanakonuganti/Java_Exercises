package com.stackroute.Exercise1;

public class ConditionalCheck {
        //To check Wheather the number is in betwwen 20-30 range
        public static String checkOut(int x) {
            if (x % 2 != 0 && x >= 20 && x <= 30) {

                return "Tom";
            } else if (x % 2 == 0 && x >= 20 && x <= 30) {
                return "Jerry";
            } else {
                return "Number is not in the 20-30 range";

            }
        }
    }
