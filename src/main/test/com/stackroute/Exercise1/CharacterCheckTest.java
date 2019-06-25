package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {
    CharacterCheck obj;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        obj=new CharacterCheck();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        obj=null;

    }
    @Test
    public void givenCheckForVowelConsonant(){
        String result=obj.check("ap");
        assertEquals("VowelConsonant",result);
    }
    @Test
    public void givenCheckForVowel(){
        String result = obj.check("a");
        assertEquals("Vowel",result);
    }
    @Test
    public void givenCheckForConsonant(){
        String result = obj.check("b");
        assertEquals("Consonant",result);
    }
}