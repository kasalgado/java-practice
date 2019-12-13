package com.kas.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    
    private static int myNumber;
    
    public static void main(String[] args) {
        System.out.println("I am thinking in a number between 1 and 100 (incluided both)");
        System.out.println("Can you guess what is it?");
        
        Random random = new Random();
        myNumber = random.nextInt(100) + 1;
        
        check();
    }
    
    private static void check() {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        number = in.nextInt();
        System.out.println("Your guess is " + number);
        
        if (number < myNumber) {
            System.out.println("The number you guess is to low!");
            check();
        } else if (number > myNumber) {
            System.out.println("The number you guess is to high!");
            check();
        } else {
            System.out.println("The number you guess is correct!");
            success(number);
        }
    }
    
    private static void success(int number) {
        System.out.println("The number that I was thinking is: " + myNumber);
        System.out.println("The number you guess is: " + number);
    }
}
