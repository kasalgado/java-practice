package com.kas.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    
    public static void main(String[] args) {
        System.out.println("I am thinking in a number between 1 and 100 (incluided both)");
        System.out.println("Can you guess what is it?");
        
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        number = in.nextInt();
        System.out.println("Your guess is " + number);
        
        Random random = new Random();
        int rndNumber = random.nextInt(100) + 1;
        
        System.out.println("The number that I was thinking is: " + rndNumber);
        System.out.println("You were off by: " + (rndNumber - number));
    }
}
