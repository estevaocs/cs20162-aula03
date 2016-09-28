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
public class Operacoes {

    /**
     * Metodo que soma os n primeiro numeros naturais
     *
     * @param n - int - numero dos n primeiros numeros a serem somados
     * @return s - valor da soma
     */
    public int somaNaturais(int n) {
        float d;
        int i, s;

        s = 0;

        for (i = 0; i <= n; i++) {
            d = (float) (1 + Math.pow(i, 2));
            s = (int) (s + (1 / d));
        }

        return (int) s;
    }

    /**
     * retorna o numero de pi até a n casa descimal
     *
     * @param n - numero de casas decimais de pi
     * @return p - o valor de pi até a n casa descimal
     */
    public float pi(int n) {
        int i;
        float s, d, p;

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

    /**
     * Calcula o fatorial de n
     *
     * @param n - numero q deseja calcular o fatorial
     * @return n!
     */
    public int fatorial(int n) {
        int f, i;

        f = 1;

        for (i = 2; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    /**
     * Calcula o logaritmo de n na base k;
     *
     * @param n - numero
     * @param k - base
     * @return valor do log
     */
    public int logaritmoNatural(int n, int k) {
        int i, e, p, f;

        e = n + 1;

        for (i = 2; i <= k; i++) {
            p = potencia(n, i);
            f = fatorial(i);
            e += p / f;
        }
        return e;
    }

    /**
     * Calcula a petencia de a no expoente b
     *
     * @param a - numero
     * @param b - expoente
     * @return valor da potencia
     */
    public int potencia(int a, int b) {
        int potencia;
        int i;

        potencia = 1;

        for (i = 1; i <= b; i++) {
            potencia = produto(potencia, a);
        }// fim for

        return (potencia);

    }// fim do método potencia

    /**
     * Calcula o produto de a por b
     *
     * @param a - fator
     * @param b - fator
     * @return produto
     */
    public static int produto(int a, int b) {
        int s; //soma das parcelas
        int i;// valor da parcela
        int totalParcelas; //total de parcelas
        int parcela; // parcelas

        s = 0;

        totalParcelas = a;
        parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }// fim if

        for (i = 0; i < totalParcelas; i++) {
            s += parcela;
        }// fim for

        return s; // retornando o valor da soma das parcelas

    }//fim método

    /**
     * Caulcua a razão aurea com o inicio dos dois numeros x e y
     * consecutivamente
     *
     * @param x - numero inteiro positivo 1
     * @param y - numero inteiro positivo 2
     * @param k - precisao
     * @return valor da razao aurea
     */
    public int razaoAurea(int x, int y, int k) {
        int a, c, t, i;

        c = y;
        a = x;

        for (i = 1; i <= k; i++) {
            t = c;
            c += a;
            a = t;
        }

        return c / a;
    }

    /**
     * Verifica se k é um quadrado perfeito
     *
     * @param k - candidato a quadrado perfeito
     * @return true = é quadrado perfeito, false = não é quadrado perfeito
     */
    public boolean quadradoPerfeito(int k) {
        int i, q;

        q = 1;
        i = 1;

        while (q < k) {
            i += 2;
            q += i;
        }

        return q == k;
    }

    /**
     * Calcula o resto da divisao de x por y
     *
     * @param x - dividendo
     * @param y - divisor
     * @return resto
     */
    public int mod(int x, int y) {
        int s;

        s = x;

        while (y <= s) {
            s -= y;
        }

        return s;
    }

    /**
     * Calcula a raiz de grau i do numero n
     *
     * @param n - numero a ser extraida a raiz
     * @param i - grau da raiz
     * @return raiz
     */
    public float raiz(int n, int i) {
        float r;

        r = 1;

        for (; i >= 0; i--) {
            r = (r + n / r) / 2;
        }

        return r;
    }

    /** Obtem um valor para o polinomio x
     *
     * @param x - polinomio
     * @param g - grau
     * @param a - polinomio = num[grau]
     * @return polinomio
     */
    public int horner(int x, int g, int[] a) {
        int p, i;

        p = a[g];

        for (i = g - 1; i >= 0; i--) {
            p = p * x + a[i];
        }

        return p;
    }

    /** Calcula o n-esimo numero da sequencia fibonacci
     *
     * @param n - n-esimo numro que deseja descobrir
     * @return - n-esimo numeo da sequencia
     */
    public int fibonacci(int n) {
        int a, c, t, i;
        
        a = 0;
        c = 1;
        
        if (n == 0 || n == 1) {
            return n;
        }
        for (i = 2; i <= n; i++) {
            t = c;
            c = c + a;
            a = t;
        }
        
        return c;
    }
}
