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
public class Fatorial {
    
    /**
     * Calcula o fatorial de n
     *
     * @param n - numero q deseja calcular o fatorial
     * @return n!
     * @throws IllegalArgumentException
     */
    public int fatorial(int n) throws IllegalArgumentException{
        int f, i;
        
        if(n < 1) {
            throw  new IllegalArgumentException("n tem que ser maior que 1");
        }
        
        f = 1;

        for (i = 2; i <= n; i++) {
            f = f * i;
        }

        return f;
    }
}
