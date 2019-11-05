package com.kas.practice;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        int age;
        String line;
        
        Scanner in = new Scanner(System.in);
        System.out.print("what is your age?: ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("what is your name?: ");
        line = in.nextLine();
        
        System.out.printf("Hello %s age %d", line, age);
    }
    
}
