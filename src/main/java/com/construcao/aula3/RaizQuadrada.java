/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.aula3;

/**
 *
 * @author Estevao
 */
public class RaizQuadrada {
   
    /**
     * Calcula a raiz de grau i do numero n
     *
     * @param n - numero a ser extraida a raiz
     * @param i - grau da raiz
     * @return raiz
     * @throws IllegalArgumentException
     */
    public float raiz(int n, int i) throws IllegalArgumentException {
        float r;

        if(n <= 0) {
            throw new IllegalArgumentException("o numero tem que ser maior"
                    + " que 0");
        }
        
        r = 1;

        for (; i >= 0; i--) {
            r = (r + n / r) / 2;
        }

        return r;
    }
 
}
