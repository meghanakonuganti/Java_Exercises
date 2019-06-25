package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatSubStringTest {
    RepeatSubString obj = null;
    @Before
    public void setUp() throws Exception {
        obj =  new RepeatSubString();
    }
    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void givenStringShouldReturnRepeatedSubString()
    {
        String result = obj.finalOutputString("Meghana",3);
        assertEquals("Meghanaanaanaana",result);
    }
    public void givenStringWithSpaceShouldReturnRepeatedSubString()
    {
        String result = obj.finalOutputString("Meghan a",3);
        assertEquals("Meghana a a a",result);
    }

}