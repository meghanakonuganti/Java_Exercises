package com.stackroute.Exercise1;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberSeriesTest {
    NumberSeries loop;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        loop=new NumberSeries();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        loop=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");

    }
    @Test
    public void givenNumberShouldDisplayLoop() {
        String result= loop.printLoop(2);
        assertEquals("122",result);

    }
    @Test
    public void givenNumberShouldDisplay() {
        String result= loop.printLoop(5);
        assertEquals("122333444455555",result);

    }
}

