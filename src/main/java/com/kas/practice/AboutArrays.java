package com.kas.practice;

import java.util.Random;
import java.util.Arrays;

public class AboutArrays {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(5)));
    }
    
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] <= high) {
                count++;
            }
        }
        
        return count;
    }
}
