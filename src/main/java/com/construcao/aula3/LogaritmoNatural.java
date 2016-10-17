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
public class LogaritmoNatural {

    /**
     * Calcula o logaritmo de n na base k;
     *
     * @param n - numero
     * @param k - base
     * @return valor do log
     */
    public double logaritmoNatural(int n, int k) {
        int i;
        double e, p, f;

        Fatorial fat = new Fatorial();

        if (n < 1) {
            throw new IllegalArgumentException("numero tem que ser maior igual a 1");
        }

        if (k < 2) {
            throw new IllegalArgumentException("A base tem que ser maior ou igual a 2");
        }

        e = n + 1;

        for (i = 2; i <= k; i++) {
            p = Math.pow(n, i);
            f = fat.fatorial(i);
            e += p / f;
        }

        return e;
    }

}
