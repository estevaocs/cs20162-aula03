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
public class SomatorioElementar {

    /**
     * Metodo que soma os n primeiro numeros naturais
     *
     * @param n - int - numero dos n primeiros numeros a serem somados
     * @return s - valor da soma
     * @throws IllegalArgumentException
     */
    public float somaNaturais(int n) throws IllegalArgumentException {
        float d;
        int i;
        float s;

        if (n < 1) {
            throw new IllegalArgumentException("n tem que ser maior ou igual a 1");
        }

        s = 0;

        for (i = 0; i <= n; i++) {
            d = (float) (1 + Math.pow(i, 2));
            s += 1 / d;
        }

        return  s;
    }
}
