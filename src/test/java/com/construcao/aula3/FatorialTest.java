/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.aula3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estevao
 */
public class FatorialTest {
    
    Fatorial f;
    
    public FatorialTest() {
        f = new Fatorial();
    }

    /**
     * Teste Valido
     */
    @Test
    public void testFatorialValido() {
        assertEquals(6, f.fatorial(3));
    }
    
    /**
     * Teste Invalido com n negativo
     */
    @Test (expected = IllegalArgumentException.class)
    public void testFatorialInalido() {
        f.fatorial(-3);
    }
    
}
