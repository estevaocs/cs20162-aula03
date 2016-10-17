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
public class RegraDeHornerTest {
    
    RegraDeHorner r;
    
    int[] a;
    
    public RegraDeHornerTest() {
        r = new RegraDeHorner();
        a =  new int[3];
        a[0] = 3;
        a[1] = 1;
        a[2] = 2;
        
    }

    /**
     * Teste valido
     */
    @Test
    public void testHorner() {
        assertEquals(13, r.horner(2, 2, a));
    }
    
    /**
     * Teste invalido com grau menor que 1
     */
    @Test (expected = IllegalArgumentException.class)
    public void testHornerIvalido() {
       r.horner(2, 0, a);
    }
    
}
