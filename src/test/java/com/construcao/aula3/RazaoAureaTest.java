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
public class RazaoAureaTest {
    
    RazaoAurea r;
    
    public RazaoAureaTest() {
        r = new RazaoAurea();
    }

    /**
     * Teste valido
     */
    @Test
    public void testRazaoAurea() {
        assertEquals(1.618,r.razaoAurea(2, 3, 3), 1.111);
    }
    
    /**
     * Teste invalido com x menor que 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testRazaoAureainvalido1() {
        r.razaoAurea(-2, 3, 3);
    }
    
    /**
     * Teste invalido com y menor que x
     */
    @Test (expected = IllegalArgumentException.class)
    public void testRazaoAureainvalido2() {
        r.razaoAurea(3, 2, 3);
    }
    
    /**
     * Teste invalido com k menor que 0
     */
    @Test (expected = IllegalArgumentException.class)
    public void testRazaoAureainvalido3() {
        r.razaoAurea(2, 3, -1);
    }
}
