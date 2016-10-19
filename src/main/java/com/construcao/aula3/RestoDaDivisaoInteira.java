package com.construcao.aula3;

/**
 *Classe contendo o Metodo mod() que retorna o resto da Divisao entre dois numeros
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class RestoDaDivisaoInteira {
    
    /**
     * Calcula o resto da divisao de x por y
     *
     * @param x - dividendo
     * @param y - divisor
     * @return resto
     * @throws IllegalArgumentException
     */
    public int mod(int x, int y) throws IllegalArgumentException {
        int s;

        if(y <= 0) {
            throw new IllegalArgumentException("O divisor nao pode ser menor nem"
                    + "igual a zero");
        }
        
        if(x < 0) {
            throw new IllegalArgumentException("dividendo nao pode ser negativo");
        }
        
        s = x;

        while (y <= s) {
            s -= y;
        }

        return s;
    }

}
