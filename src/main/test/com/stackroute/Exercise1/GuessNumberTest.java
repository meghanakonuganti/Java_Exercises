package com.stackroute.Exercise1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuessNumberTest {

    GuessNumber guessNumber;
    String actualResult;
    String expectedResult;

    @org.junit.Before
    public void setUp() throws Exception {
        guessNumber = new GuessNumber();
    }

    @Test
    public void checkWhetherTheNumberIsCorrect() {
        actualResult = guessNumber.checkWhetherTheNumberGuessedIsCorrectOrNot(new int[]{10, 20, 30});
        expectedResult = "Number guessed matches the original number";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        guessNumber = null;
    }
}