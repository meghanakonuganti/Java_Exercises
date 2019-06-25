package com.stackroute.Exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerifyLettersTest {

    VerifyLetters typeOfCharacter;
    String actualResult;
    String expectedResult;
    @org.junit.Before
    public void setUp() throws Exception {
        typeOfCharacter = new VerifyLetters();
    }

    @Test
    public void checkTheCapitalInputCharacter() {
        actualResult = typeOfCharacter.determineTheTypeOfCharacter('Z');
        expectedResult = "Capital Letter";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkTheSymbolInputCharacter() {
        actualResult = typeOfCharacter.determineTheTypeOfCharacter('@');
        expectedResult = "Special Symbol";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        typeOfCharacter = null;
    }
}