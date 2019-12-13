package com.kas.practice;

public class Conditionals {

    public String OneToNineWrong(int number) {
        if (number > 0) {
            if (number < 10) {
                return "Number is correct";
            }
        }
        
        return "Number is incorrect";
    }
    
    public String OneToNineCorrect(int number) {
        if (number > 0 && number < 10) {
            return "Number is correct";
        } else {
            return "Number is incorrect";
        }
    }

}
