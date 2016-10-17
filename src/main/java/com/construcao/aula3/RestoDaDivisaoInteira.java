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
public class RestoDaDivisaoInteira {
    
    /**
     * Calcula o resto da divisao de x por y
     *
     * @param x - dividendo
     * @param y - divisor
     * @return resto
     * @throws IllegalArgumentException
     */
    public int mod(int x, int y) throws IllegalArgumentException {
        int s;

        if(y <= 0) {
            throw new IllegalArgumentException("O divisor nao pode ser menor nem"
                    + "igual a zero");
        }
        
        if(x < 0) {
            throw new IllegalArgumentException("dividendo nao pode ser negativo");
        }
        
        s = x;

        while (y <= s) {
            s -= y;
        }

        return s;
    }

}
