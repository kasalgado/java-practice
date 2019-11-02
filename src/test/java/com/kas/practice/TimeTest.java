package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testTimeSinceMidnight() {
        int hour = 17;
        int minute = 2;
        int second = 32;
        
        int totalSeconds = (hour * 60 * 60) + (minute * 60) + second;
        
        Time time = new Time(hour, minute, second);
        
        assertEquals(totalSeconds, time.seconds());
    }
    
    @Test
    public void testTimeUntilMidnight() {
        int hour = 17;
        int minute = 2;
        int second = 32;
        
        int restSeconds = 60 - second;
        int restMinutes = 60 - minute - 1;
        int restHours = 24 - hour - 1;
        
        int totalSeconds = (restHours * 60 * 60) + (restMinutes * 60) + restSeconds;
        
        Time time = new Time(hour, minute, second);
        
        assertEquals(totalSeconds, time.rest());
    }
    
    @Test
    public void testCanGetPastPercentage() {
        int hour = 17;
        int minute = 2;
        int second = 32;
        int secondsInOneDay = 60 * 60 * 24;
        
        int totalSeconds = (hour * 60 * 60) + (minute * 60) + second;
        int percentage = totalSeconds * 100 / secondsInOneDay;
        
        Time time = new Time(hour, minute, second);
        
        assertEquals(percentage, time.percentage());
    }
    
}
