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
public class LogaritmoNaturalTest {
    
    LogaritmoNatural l;
    
    public LogaritmoNaturalTest() {
        l = new LogaritmoNatural();
    }

    /**
     * Teste Valido
     */
    @Test
    public void testLogaritmoNatural() {
        assertEquals(6.333, l.logaritmoNatural(2, 3), 1.111);
    }
    
    /**
     * Teste invalido com n menor que 1
     */
    @Test (expected = IllegalArgumentException.class)
    public void testLogaritmoNaturalInvalido1() {
         l.logaritmoNatural(0, 3);
    }
    
    /**
     * Teste invalido com k menor que 2
     */
    @Test (expected = IllegalArgumentException.class)
    public void testLogaritmoNaturalInvalido2() {
         l.logaritmoNatural(2, 1);
    }
    
}
