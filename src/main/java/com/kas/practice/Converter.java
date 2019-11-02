package com.kas.practice;

import java.util.Scanner;

public class Converter {
    
    final double CM_PER_INCH = 2.4;
    final double INCHES_PER_CM = 1 / 2.4;
    
    public double inchesToCms(int inches) {
        return inches * CM_PER_INCH;
    }
    
    public double cmsToInches(int cm) {
        return cm * INCHES_PER_CM;
    }
    
    public static void main(String[] args) {
        int inch;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many inches?: ");
        inch = in.nextInt();
        
        System.out.print(inch + " in cm = ");
        System.out.println(inch * 2.4);
        System.out.printf("Well done format: %.2f\n", inch * 2.4);
    }
}
