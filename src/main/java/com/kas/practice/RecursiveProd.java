package com.kas.practice;

public class RecursiveProd {
    
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
        System.out.println(oddSum(3));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }
    
    public static int product(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n * product(m, n -1);
        }
    }
    
    public static int oddSum(int n) {
        if (n == 0) {
            return n;
        } else {
            int next = oddSum(n - 1);
            int sume = n + next;
            
            return sume;
        }
    }
}
