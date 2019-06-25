package com.stackroute.Exercise1;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOperationsTest {

    NumberOperations sortNumbers;
    String expectedResult;
    String actualResult;

    @org.junit.Before
    public void setUp() throws Exception {
        sortNumbers = new NumberOperations();
    }

    @Test
    public void checkWhetherSumIsLess() {
        expectedResult = sortNumbers.sortNumbersAndAddEvenNumber("12343");
        actualResult = "False";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherSumIsGreater() {
        expectedResult = sortNumbers.sortNumbersAndAddEvenNumber("24442");
        actualResult = "True";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sortNumbers = null;
    }
}