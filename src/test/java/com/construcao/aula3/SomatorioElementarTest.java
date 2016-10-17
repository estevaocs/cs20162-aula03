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
public class SomatorioElementarTest {
    
    SomatorioElementar s;
    
    public SomatorioElementarTest() {
        s = new SomatorioElementar();
    }

    /**
     * Teste com somatorio valido
     */
    @Test
    public void testSomaNaturaisValido() {
        assertEquals(1.8972, s.somaNaturais(5), 9);
    }
    
    /**
     * Teste com somatorio invalido
     */
    @Test (expected = IllegalArgumentException.class)
    public void testSomaNaturaisInvalido() {
        s.somaNaturais(-5);
    }
    
}
