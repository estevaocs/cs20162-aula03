/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.aula3;

import java.util.IllegalFormatException;

/**
 *
 * @author Estevao
 */
public class RegraDeHorner {
    
    /** 
     * Obtem um valor para o polinomio x
     *
     * @param x - polinomio
     * @param g - grau
     * @param a - polinomio = num[grau]
     * @return polinomio
     * @throws IllegalArgumentException
     */
    public int horner(int x, int g, int[] a) throws IllegalArgumentException {
        int p, i;

        if(g < 1) {
            throw new IllegalArgumentException("o grau tem que ser maior que 0");
        }
        
        p = a[g];

        for (i = g - 1; i >= 0; i--) {
            p = p * x + a[i];
        }

        return p;
    }

}
