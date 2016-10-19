package com.construcao.aula3;

/**
 *Classe que retorna um valor de pi.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class CalculoDoValorDePI {
    
    /**
     * retorna o numero de pi até a n casa descimal
     *
     * @param n - numero de casas decimais de pi
     * @return p - o valor de pi até a n casa descimal
     * @throws IllegalAccessError
     */
    public float pi(int n) {
        int i;
        float s, d, p;
        
        if(n < 1) {
            throw new IllegalArgumentException("n tem que ser maior que 1");
        }

        s = -1;
        d = -1;
        p = 0;

        for (i = 1; i <= n; i++) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
        }

        return p;
    }

}
