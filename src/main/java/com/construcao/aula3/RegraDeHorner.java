package com.construcao.aula3;

/**
 *Classe contendo o Metodo horner que serve para polinomio
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
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
