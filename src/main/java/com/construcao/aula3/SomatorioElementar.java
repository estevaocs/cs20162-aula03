package com.construcao.aula3;

/**
 *Classe contendo o Metodo de Soma dos primeiros números naturais
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class SomatorioElementar {

    /**
     * Metodo que soma os n primeiro numeros naturais
     *
     * @param n - int - numero dos n primeiros numeros a serem somados
     * @return s - valor da soma
     * @see Metodo pow() da biblioteca nativa do java.​lang.​Math. Que realiza a 
     * potenciação
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
