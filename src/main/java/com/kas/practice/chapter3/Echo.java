package com.kas.practice.chapter3;

import java.util.Scanner;

public class Echo {
    
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
    }

}
