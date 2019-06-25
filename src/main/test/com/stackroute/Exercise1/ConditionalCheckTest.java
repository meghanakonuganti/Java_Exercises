package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConditionalCheckTest {
    ConditionalCheck obj = null;
    @Before
    public void setUp() throws Exception {
        obj = new ConditionalCheck();
    }
    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void givenEvenNumberShouldReturnJerry(){
        String result=obj.checkOut( 28);
    }
    @Test
    public void givenOddNumberShouldReturnTom(){
        String result=obj.checkOut( 21);
    }
    @Test
    public void givenNumberOutOfRangeShouldReturnMessage(){
        String result=obj.checkOut( 32);
    }

}