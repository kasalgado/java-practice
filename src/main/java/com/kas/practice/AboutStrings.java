package com.kas.practice;

public class AboutStrings {

    public static void main(String [] args) {
        String message = letter("Malin", 2);
        System.out.println(message);
        
        alphabet();
        
        System.out.println((char) 64);
        
        String text = "Computer Science is fun!";
        System.out.println(text.replace("Computer Science", "CS"));
    }
    
    public static String letter(String name, int p) {
        char a = name.charAt(p);
        
        if (a == 'a') {
            return "You got it";
        } else {
            return "You got it";
        }
    }
    
    public static void alphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        
        System.out.println();
    }
    
    public static String reverse(String text) {
        String r = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            r = r + text.charAt(i);
        }
        
        return r;
    }
    
    public static boolean compare(String name1, String name2) {
        return name1.equals(name2);
    }
    
    public static String findSub(String text, int pos) {
        return text.substring(pos);
    }
    
    public static String getFormated(int hour, int minute) {
        String subfix;
        
        if (hour < 12) {
            subfix = "AM";
        } else {
            hour = hour - 12;
            subfix = "PM";
        }
        
        return subfix.format("%02d:%02d %s", hour, minute, subfix);
    }
}
