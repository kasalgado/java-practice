package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    
    @Test
    public void testCanGetCentimetersFromInches() {
        int inches = 4;
        double factor = 2.4;
        
        Converter converter = new Converter();
        
        assertEquals(inches * factor, converter.inchesToCms(inches));
    }
    
    @Test
    public void testCanGetInchesFromCentimeter() {
        int cms = 3;
        double factor = 1 / 2.4;
        
        Converter converter = new Converter();
        
        assertEquals(cms * factor, converter.cmsToInches(cms));
    }
}
