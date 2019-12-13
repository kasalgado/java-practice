package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AboutStringsTest {
    
    @Test
    public void testReverse() {
        String text = "Elena";
        String expected = "anelE";
        
        AboutStrings strings = new AboutStrings();
        
        assertEquals(expected, strings.reverse(text));
    }
    
    @Test
    public void testCanCompareTwoStrings() {
        String name1 = "Malin Salgado";
        String name2 = "Malin Salgado";
        
        AboutStrings strings = new AboutStrings();
        
        assertTrue(strings.compare(name1, name2));
    }
    
    @Test
    public void testCanFetchSubString() {
        String expected = "foo";
        String text = "bar and foo";
        
        AboutStrings strings = new AboutStrings();
        
        assertEquals(expected, strings.findSub(text, 8));
    }
    
    @Test
    public void testCanGetHourInTwelveFormat() {
        String expected = "02:44 PM";
        int hour = 14;
        int minute = 44;
        
        AboutStrings strings = new AboutStrings();
        
        assertEquals(expected, strings.getFormated(hour, minute));
    }
}
