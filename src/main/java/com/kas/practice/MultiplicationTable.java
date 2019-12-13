package com.kas.practice;

public class MultiplicationTable {

    public static void printRow(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            System.err.printf("%4d", i * n);
            i = i + 1;
        }
        System.err.println();
    }
    
    public static void printTable(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow(i, i);
            i = i + 1;
        }
    }
    
    public static void main(String[] args) {
        printTable(7);
    }
}
