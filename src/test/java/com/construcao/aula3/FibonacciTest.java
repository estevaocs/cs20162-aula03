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
public class FibonacciTest {
    
    Fibonacci f;
    
    public FibonacciTest() {
        f = new Fibonacci();
    }

    /**
     * Teste valido com n igual a 0
     */
    @Test
    public void testFibonacciValido1() {
        assertEquals(0, f.fibonacci(0));
    }
    
    /**
     * Teste valido com n igual a 1
     */
    @Test
    public void testFibonacciValido2() {
        assertEquals(1, f.fibonacci(1));
    }
    
     /**
     * Teste valido com n igual a 1
     */
    @Test
    public void testFibonacciValido3() {
        assertEquals(2, f.fibonacci(3));
    }
 
    /**
     * Teste invalido com n negativo
     */
    @Test (expected = IllegalArgumentException.class)
    public void testFibonacciInvalido1() {
        f.fibonacci(-1);
    }
    
}
