package com.kas.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    
    @Test
    public void testReturnHelloWorld() {
        Person person = new Person();
        Assertions.assertEquals("Hello World", person.greeting());
    }
    
    @Test
    public void testCanGetGreetingWithName() {
        Person person = new Person();
        Assertions.assertEquals("Hello Malin", person.hello("Malin"));
    }
    
}
