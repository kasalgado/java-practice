package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionalsTest {
    
    @Test
    public void testCanGetCorrectAnswerFromWrongConditional() {
        int number = 4;
        String expected = "Number is correct";
        
        Conditionals conditionals = new Conditionals();
        
        assertEquals(expected, conditionals.OneToNineWrong(number));
    }
    
    @Test
    public void testCanGetWrongAnswerFromWrongConditional() {
        int number = 11;
        String expected = "Number is incorrect";
        
        Conditionals conditionals = new Conditionals();
        
        assertEquals(expected, conditionals.OneToNineWrong(number));
    }
    
    @Test
    public void testCanGetCorrectAnswerFromRightConditional() {
        int number = 4;
        String expected = "Number is correct";
        
        Conditionals conditionals = new Conditionals();
        
        assertEquals(expected, conditionals.OneToNineCorrect(number));
    }
    
    @Test
    public void testCanGetWrongAnswerFromRightConditional() {
        int number = 11;
        String expected = "Number is incorrect";
        
        Conditionals conditionals = new Conditionals();
        
        assertEquals(expected, conditionals.OneToNineCorrect(number));
    }
    
}
