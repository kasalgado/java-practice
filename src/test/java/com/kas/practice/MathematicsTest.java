package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathematicsTest {
    
    @Test
    public void testFactorial() {
        assertEquals(24, Mathematics.factorial(4));
    }
    
    @Test
    public void testFibonacci() {
        assertEquals(1, Mathematics.fibonacci(1));
    }
    
    @Test
    public void testIsDivisible() {
        assertTrue(Mathematics.isDivisible(10, 2));
        assertFalse(Mathematics.isDivisible(10, 3));
    }
    
    @Test
    public void testIsTriangle() {
        assertTrue(Mathematics.isTriangle(2, 3, 4));
        assertFalse(Mathematics.isTriangle(2, 3, 6));
    }
    
    @Test
    public void testAckermannFunction() {
        assertEquals(1, Mathematics.ackermann(0, 0));
        assertEquals(1, Mathematics.ackermann(2, 0));
        assertEquals(2, Mathematics.ackermann(1, 1));
    }
    
    @Test
    public void testCanFindSquare() {
        assertEquals(0.0, Mathematics.findSquareRoot(9));
    }
}
