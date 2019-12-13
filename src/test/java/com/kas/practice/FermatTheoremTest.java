package com.kas.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FermatTheoremTest {
    
    @Test
    public void testIfTheoremIsCorrect() {
        
        String expected = "Holy smokes, Fermat was correct!";
        
        FermatTheorem fermat = new FermatTheorem(3, 4, 5, 3);
        
        assertEquals(expected, fermat.check());
    }
    
    @Test
    public void testIfTheoremIsIncorrect() {
        
        String expected = "No, that doesn’t work.";
        
        FermatTheorem fermat = new FermatTheorem(3, 4, 5, 2);
        
        assertEquals(expected, fermat.check());
    }
    
}
