package com.construcao.aula3;

/**
 *Classe contendo o metodo raiz() que calcula a raiz com de um certo grau de um 
 * numero qualquer.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class RaizQuadrada {
   
    /**
     * Calcula a raiz de grau i do numero n
     *
     * @param n - numero a ser extraida a raiz
     * @param i - grau da raiz
     * @return raiz - double
     * @throws IllegalArgumentException
     */
    public double raiz(int n, int i) throws IllegalArgumentException {
        double r;

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
