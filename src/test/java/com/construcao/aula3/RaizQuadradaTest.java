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
public class RaizQuadradaTest {
    
    RaizQuadrada r;
    
    public RaizQuadradaTest() {
        r = new RaizQuadrada();
    }

    /**
     * Teste valido
     */
    @Test
    public void testRaiz() {
        assertEquals(2, r.raiz(4, 2), 1);
    }
    
    /**
     * Teste invalido com n igual ou menor que 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testRaizInvalido() {
        r.raiz(0, 2);
    }
    
}
