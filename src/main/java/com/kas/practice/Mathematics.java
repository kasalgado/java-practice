package com.kas.practice;

public class Mathematics {
    
    public static void main(String[] args) {
        double a = 25.0;
        double root = Math.sqrt(a);
        System.out.println("Root of " + a + " is " + root);
        
        double degrees = 90;
        double angle = degrees / 180.0 * Math.PI;
        System.out.println("Radians of " + degrees + " is " + angle);
        System.out.println("Radians of " + degrees + " is " + Math.toRadians(degrees));
        System.out.println("Radians of " + degrees + " rounded is " + Math.round(Math.toRadians(degrees)));
        
        double b = 10.0;
        double x = Math.pow(b, 3.0);
        
        System.out.println("Power of " + b + " is " + x);
        System.out.println("Factorial: " + factorial(3));
        System.out.println("Fibonacci: "  + fibonacci(3));
        System.out.println("Ackermann: "  + ackermann(1, 1));
        
        System.out.println(findSquareRoot(49));
    }
    
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        
        int recurse = factorial(number - 1);
        int result = number * recurse;
        
        return result;
    }

    static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    
    static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    static boolean isTriangle(int x, int y, int z) {
        if ((x + y) > z && (x + z) > y && (y + z) > x) {
            return true;
        } else {
            return false;
        }
    }
    
    static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, n);
        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
        
        return n;
    }
    
    static double findSquareRoot(double n) {
        int counter = 2;
        double square = 0.0;
        
        while ((square * square) != n) {
            square = (counter + n / counter) / 2;
            counter++;
        }
        
        return square;
    }
}
