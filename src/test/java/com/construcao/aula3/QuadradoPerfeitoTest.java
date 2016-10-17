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
public class QuadradoPerfeitoTest {
    
    QuadradoPerfeito qr;
    
    public QuadradoPerfeitoTest() {
        qr =  new QuadradoPerfeito();
    }

    /**
     * Teste valido
     */
    @Test
    public void testQuadradoPerfeito() {
        assertEquals(true, qr.quadradoPerfeito(25));
    }
    
    /**
     * Teste valido
     */
    @Test
    public void testQuadradoPerfeito2() {
        assertEquals(false, qr.quadradoPerfeito(13));
    }
    
    /**
     * Teste invalido
     */
    @Test (expected = IllegalArgumentException.class)
    public void testQuadradoPerfeitoInvalido() {
        qr.quadradoPerfeito(-25);
    }
    
    
}
