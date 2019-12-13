package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultaddTest {
    
    @Test
    public void testMultadd() {
        double x = 1.0;
        double y = 2.0;
        double z = 3.0;
        
        assertEquals(x * y + z, Multadd.multadd(x, y, z));
    }
    
}
