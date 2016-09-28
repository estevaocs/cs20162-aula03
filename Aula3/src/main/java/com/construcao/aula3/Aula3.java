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
public class Aula3 {
    
    public static void main(String[] args) {
        int[] a = new int[6];
        
        a[0] = 4;
        a[1] = 6;
        a[2] = 1;
        a[3] = 3;
        a[4] = 1;
        a[5] = 4;
        Operacoes op = new Operacoes();
        
        System.out.println("soma dos 4 primeiros num : " + op.somaNaturais(4));
        System.out.println("pi até a 12 casa descimal: " + op.pi(12));
        System.out.println("o fatorial de 6 é: " + op.fatorial(6));
        System.out.println("o logaritmo de 5 na base 10 é: " 
                + op.logaritmoNatural(5, 10));
        System.out.println("A razao aurea cujo os numero inicias é 1 4: " 
                +  op.razaoAurea(1, 4, 3));
        System.out.print("O numero 25 é quadrado perfeito?");
        if(op.quadradoPerfeito(25)){
            System.out.println("é quadrado perfeito");
        } else {
            System.out.println("nao é quadrado perfeito");
        }
        System.out.println("O resto da divisão entre 27 / 5 é: " 
                + op.raiz(27, 5));
        System.out.println("Avaliando o polinômio 4x^5+x^4+3x^3+x^2+6x+4:" 
                + op.horner(5, 5, a));
        System.out.println("O sexto numero da sequencia fibonacci é: " 
                + op.fibonacci(6));
    }
}
