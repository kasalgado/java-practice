package com.kas.practice;

public class Morganslaw {
    
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        
        System.out.println(!(a && b));
        System.out.println(!a || !b);
        System.out.println(!(a || b));
        System.out.println(!a && !b);
        
        int x = 4;
        int y = 3;
        System.out.println(!(x < 5 && y == 3));
        System.out.println(x >= 5 || y != 3);
        
    }
}
