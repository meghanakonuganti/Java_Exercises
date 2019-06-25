package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseStringTest {
    ReverseString str = null;
    @Before
    public void setUp() throws Exception {
        str=new ReverseString();
    }
    @After
    public void tearDown() throws Exception{
        str=null;
    }
    @Test
    public void givenStringShouldReturnReverseString()
    {
        String rev = str.reverse("MEGHANA");
        assertEquals("ANAHGEM",rev);
    }
    @Test
    public void givenStringWithSpaceShouldReturnReverseString()
    {
        String rev = str.reverse(" Hello MEGHANA @ the ");
        assertEquals(" eht @ ANAHGEM olleH ",rev);
    }

}