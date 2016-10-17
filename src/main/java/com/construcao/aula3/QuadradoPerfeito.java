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
public class QuadradoPerfeito {
    
    /**
     * Verifica se k é um quadrado perfeito
     *
     * @param k - candidato a quadrado perfeito
     * @return true = é quadrado perfeito, false = não é quadrado perfeito
     * @throws IllegalArgumentException
     */
    public boolean quadradoPerfeito(int k) throws IllegalArgumentException {
        int i, q;

        if(k < 1) {
            throw new IllegalArgumentException("O numero tem que ser maior ou"
                    + " igual à que 1");
        }
        
        q = 1;
        i = 1;

        while (q < k) {
            i += 2;
            q += i;
        }

        return q == k;
    }
}
