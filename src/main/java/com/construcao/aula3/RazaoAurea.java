package com.construcao.aula3;

/**
 *Classe contendo que Calcula a razão aurea.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class RazaoAurea {
   
    /**
     * Caulcua a razão aurea com o inicio dos dois numeros x e y
     * consecutivamente
     *
     * @param x - numero inteiro positivo 1
     * @param y - numero inteiro positivo 2
     * @param k - precisao
     * @return valor da razao aurea
     * @throws IllegalArgumentException
     */
    public int razaoAurea(int x, int y, int k) throws IllegalArgumentException {
        int a, c, t, i;

        if(x < 0) {
            throw new IllegalArgumentException("o numero nao pode ser negativo");
        }
        
        if(x >= y) {
            throw new IllegalArgumentException("o segundo numero nao poder ser"
                    + " menor ou igual à x");
        }
        
        if(k <= 0) {
            throw new IllegalArgumentException("A precisao nao pode ser menor"
                    + " ou igual a 0");
        }
        
        c = y;
        a = x;

        for (i = 1; i <= k; i++) {
            t = c;
            c += a;
            a = t;
        }

        return c / a;
    }
 
}
