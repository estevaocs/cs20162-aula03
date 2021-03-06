package com.construcao.aula3;

/**
 *Classe contendo o Metodo quadradoPerfeito() que verifica se um numero é ou não
 * quadrado perfeito.
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
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
