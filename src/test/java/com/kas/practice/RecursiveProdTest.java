package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveProdTest {
    
    @Test
    public void testCanGetResult() {
        RecursiveProd recursiveProd = new RecursiveProd();
        
        assertEquals(24, recursiveProd.prod(1, 4));
        assertEquals(120, recursiveProd.product(1, 5));
    }
    
    @Test
    public void testCanAddRecursive() {
        RecursiveProd recursive = new RecursiveProd();
        
        assertEquals(6, recursive.oddSum(3));
    }
}
