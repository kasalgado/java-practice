package com.kas.practice;

public class Blastoff {
    
    public static void main(String[] args) {
        countdown(3);
    }

    private static void countdown(int i) {
        if (i == 0) {
            System.out.println("Blastoff!");
        } else {
            countdown(i - 1);
            System.out.println(i);
        }
    }
}
