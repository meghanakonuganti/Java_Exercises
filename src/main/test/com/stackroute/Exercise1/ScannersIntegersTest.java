package com.stackroute.Exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScannersIntegersTest {

    ScannersIntegers scannersIntegers;
    int expectedResult;
    int actualResult;

    @org.junit.Before
    public void setUp() throws Exception {
        scannersIntegers = new ScannersIntegers();
    }

    @Test
    public void checkWhetherNumbersAreScannedAndAdded() {
        expectedResult = scannersIntegers.readIntegersAndAddThem(new int[]{10, 20, 30, 0});
        actualResult = 60;
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        scannersIntegers = null;
    }
}