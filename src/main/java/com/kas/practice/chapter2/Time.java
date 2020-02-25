package com.kas.practice.chapter2;

public class Time {

    private int totalSeconds;
    private int totalRestSeconds;
    private int percentage;
    
    public Time(int hour, int minute, int second) {
        this.totalSeconds = (hour * 3600) + (minute * 60) + second;
        this.calculateRest(hour, minute, second);
        this.calculatePercentage(hour, minute, second);
    }
    
    public int seconds() {
        return this.totalSeconds;
    }

    public int rest() {
        return this.totalRestSeconds;
    }
    
    private void calculateRest(int hour, int minute, int second) {
        int restSeconds = 60 - second;
        int restMinutes = 60 - minute - 1;
        int restHours = 24 - hour - 1;
        
        this.totalRestSeconds = (restHours * 60 * 60) + (restMinutes * 60) + restSeconds;
    }

    public int percentage() {
        return this.percentage;
    }
    
    private void calculatePercentage(int hour, int minute, int second) {
        int secondsInOneDay = 60 * 60 * 24;
        this.percentage = this.totalSeconds * 100 / secondsInOneDay;
    }
    
}
