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
public class CalculoDoValorDePITest {
    
    CalculoDoValorDePI p;
    
    public CalculoDoValorDePITest() {
        p = new CalculoDoValorDePI();
    }

    /**
     * Teste valido com pi;
     */
    @Test
    public void testPiValido() {
        assertEquals(3.14, p.pi(2), 2);
    }
    
    /**
     * Teste invalido com n negativo;
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPiInvalido() {
        p.pi(-2);
    }
}
