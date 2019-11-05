package com.kas.practice;

import java.util.Scanner;

public class Converter {
    
    final double CM_PER_INCH = 2.4;
    final double INCHES_PER_CM = 1 / 2.4;
    
    double inchesToCms(int inches) {
        return inches * CM_PER_INCH;
    }
    
    double cmsToInches(int cm) {
        return cm * INCHES_PER_CM;
    }
    
    static void main(String[] args) {
        int inch;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many inches?: ");
        inch = in.nextInt();
        
        System.out.print(inch + " in cm = ");
        System.out.println(inch * 2.4);
        System.out.printf("Well done format: %.2f\n", inch * 2.4);
    }

    double celciusToFahrenheit(double celcius) {
        return celcius * (9.0 / 5.0) + 32;
    }

    String totalSeconds(int value) {
        int restSeconds = 0;
        int totalSecondsInOneHour = 3600;
        int totalSecondsInOneMinute = 60;
        
        int totalHours = value / totalSecondsInOneHour;
        restSeconds = value % totalSecondsInOneHour;
        
        int totalMinutes = restSeconds / totalSecondsInOneMinute;
        restSeconds = restSeconds % totalSecondsInOneMinute;
        
        return value + " seconds = " + totalHours + " hours, " + totalMinutes + " minutes, and " + restSeconds + " seconds";
    }
}
