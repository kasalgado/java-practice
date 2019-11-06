package com.kas.practice;

public class Mathematics {
    
    public static void main(String[] args) {
        double a = 25.0;
        double root = Math.sqrt(a);
        System.out.println("Root of " + a + " is " + root);
        
        double degrees = 90;
        double angle = degrees / 180.0 * Math.PI;
        System.out.println("Radians of " + degrees + " is " + angle);
        System.out.println("Radians of " + degrees + " is " + Math.toRadians(degrees));
        System.out.println("Radians of " + degrees + " rounded is " + Math.round(Math.toRadians(degrees)));
        
        double b = 10.0;
        double x = Math.pow(b, 3.0);
        System.out.println("Power of " + b + " is " + x);
    }
}
