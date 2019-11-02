package com.kas.practice;

class Person {
    
    private Name personName;
    
    public Person(Name personName) {
        this.personName = personName;
    }
    
    public Person() {
        
    }

    public String greeting() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }
    
}
