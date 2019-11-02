package com.kas.practice;

class Calculator {
    
    private int operand1;
    private int operand2;
    
    public Calculator(int multiplier1, int multiplier2) {
        this.operand1 = multiplier1;
        this.operand2 = multiplier2;
    }

    public int multiply() {
        return this.operand1 * this.operand2;
    }
    
}
