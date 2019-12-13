package com.kas.practice;

public class Loop {

    public static void main(String[] args) {
        loop(22);
    }
    
    public static void loop(int n) {
        int i = n;
        
        while (i > 1) {
            System.out.println(i + " " + n);
            
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i++;
            }
        }
    }
}
