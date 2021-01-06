/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Melone
 */
public class CalendarioTest {
    
    public CalendarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Giornosettimana method, of class Calendario.
     */
    @Test
    public void testGiornosettimana() {
        System.out.println("Giornosettimana");
        Calendario instance = new Calendario (9,11,2015);
        String expResult = "lunedi";
        String result = instance.Giornosettimana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of GiornoSuccessivo method, of class Calendario.
     */
    @Test
    public void testGiornoSuccessivo() {
        System.out.println("GiornoSuccessivo");
        Calendario instance = new Calendario (9,11,2015);
        String expResult = "10/11/2015";
        String result = instance.GiornoSuccessivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
