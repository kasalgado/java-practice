package com.kas.practice;

public class DistanceBetweenTwoPoints {

    private static double x1, x2;
    private static double y1, y2;
    
    public static void main(String[] args) {
        x1 = 1.0;
        y1 = 2.0;
        x2 = 4.0;
        y2 = 6.0;
        
        double distance = calculate();
        double area = calculateArea(distance);
        
        System.out.println("Distance: " + distance);
        System.out.println("Area: " + area);
    }
    
    private static double calculate() {
        double dx = Math.pow((x2 - x1), 2);
        double dy = Math.pow((y2 - y1), 2);
        double distance = Math.sqrt(dx + dy);
        
        return distance;
    }
    
    private static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
}
