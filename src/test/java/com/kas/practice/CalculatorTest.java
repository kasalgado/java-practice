package com.kas.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    
    @Test
    public void testCanMultiply() {
        Calculator calculator = new Calculator(2, 2);
        
        Assertions.assertEquals(4, calculator.multiply());
        
    }
    
}
