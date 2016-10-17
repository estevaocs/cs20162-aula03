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
public class Fibonacci {

    /** Calcula o n-esimo numero da sequencia fibonacci
     *
     * @param n - n-esimo numro que deseja descobrir
     * @return - n-esimo numeo da sequencia
     * @throws IllegalArgumentException
     */
    public int fibonacci(int n)throws IllegalArgumentException{
        int a, c, t, i;
        
        if(n < 0) {
            throw new IllegalArgumentException("n tem que ser positivo");
        }
        
        a = 0;
        c = 1;
        
        if (n == 0 || n == 1) {
            return n;
        }
        for (i = 2; i <= n; i++) {
            t = c;
            c += a;
            a = t;
        }
        
        return c;
    }
}
