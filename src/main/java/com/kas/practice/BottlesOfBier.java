package com.kas.practice;

public class BottlesOfBier {

    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            firstSentence(i);
            secondSentence(i);
            thridSentence();
            fourthSentence(i - 1);
            System.out.println();
        }
        
        finalSentences();
    }
    
    private static void firstSentence(int number) {
        System.out.println(number + " bottles of bier in the wall");
    }
    
    private static void secondSentence(int number) {
        System.out.println(number + " bottles of bier");
    }
    
    private static void thridSentence() {
        System.out.println("ya´ take one down, ya´ pass it around");
    }
    
    private static void fourthSentence(int number) {
        System.out.println(number + " bottles of bier in the wall");
    }
    
    private static void finalSentences() {
        System.out.println("No bottles of bier on the wall");
        System.out.println("no bottles of bier");
        System.out.println("ya´ can't take one down, ya´ can't pass it around,");
        System.out.println("´cause there are no more bottles of beer on the wall!");
    }
}
