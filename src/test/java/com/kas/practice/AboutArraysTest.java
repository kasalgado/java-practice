package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AboutArraysTest {
    
    @Test
    public void testRandomArray() {
        AboutArrays allArrays = new AboutArrays();
        int[] result = allArrays.randomArray(5);
        
        assertEquals(5, result.length);
    }
    
    @Test
    public void testInRange() {
        AboutArrays allArrays = new AboutArrays();
        int[] a = {2, 4, 6};
        int result = allArrays.inRange(a, 4, 8);
        
        assertEquals(2, result);
    }
}
