package com.kas.practice;

class FermatTheorem {
    
    int a, b, c, n;

    FermatTheorem(int a, int b, int c, int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.n = n;
    }
    
    String check() {
        if (this.getSume() != this.getResult()) {
            return "Holy smokes, Fermat was correct!";
        } else {
            return "No, that doesn’t work.";
        }
    }
    
    private double getSume() {
        double a = Math.pow(this.a, this.n);
        double b = Math.pow(this.b, this.n);
        
        return a + b;
    }
    
    private double getResult() {
        double c = Math.pow(this.c, this.n);
        
        return c;
    }

}
