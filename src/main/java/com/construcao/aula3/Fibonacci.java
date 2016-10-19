package com.construcao.aula3;

/**
 *Classe trablaha com a sequencia fibonacci.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
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
