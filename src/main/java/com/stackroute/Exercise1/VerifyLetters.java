package com.stackroute.Exercise1;

/*
Takes a character from the user as input and determines whether the character is capital letter, a small case letter,
a digit or a special symbol.
 */

public class VerifyLetters {

    public static String determineTheTypeOfCharacter(char inputCharacter) {
        if(inputCharacter >= 'A' && inputCharacter <= 'Z') {
            return "Capital Letter";
        }
        else if(inputCharacter >= 'a' && inputCharacter <= 'z') {
            return "Small Letter";
        }
        else if(inputCharacter >= '0' && inputCharacter <= '9') {
            return "Digit";
        }
        else {
            return "Special Symbol";
        }
    }
}