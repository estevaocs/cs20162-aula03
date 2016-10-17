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
public class RestoDaDivisaoInteiraTest {
    
    RestoDaDivisaoInteira m;
    
    public RestoDaDivisaoInteiraTest() {
        m = new RestoDaDivisaoInteira();
    }

    /**
     * Teste Valido
     */
    @Test
    public void testMod() {
        assertEquals(1, m.mod(5, 2));
    }
    
    /**
     * Teste invalido com x negativo
     */
    @Test (expected = IllegalArgumentException.class)
    public void testModInvalido() {
         m.mod(-5, 2);
    }
    
    /**
     * Teste invalido com y menor que 1
     */
    @Test (expected = IllegalArgumentException.class)
    public void testModInvalido2() {
         m.mod(5, 0);
    }
    
}
