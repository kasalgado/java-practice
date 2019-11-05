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
    
    @Test
    public void testCanGetFahrenheitFromCelcius() {
        double expected = 75.2;
        
        Converter converter = new Converter();
        
        assertEquals(expected, converter.celciusToFahrenheit(24.0));
    }
    
    @Test
    public void testCanGetTotalSecondsFromInteger() {
        String expected = "5000 seconds = 1 hours, 23 minutes, and 20 seconds";
        int value = 5000;
        
        Converter converter = new Converter();
        
        assertEquals(expected, converter.totalSeconds(value));
    }
}
