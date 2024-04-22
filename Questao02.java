/*Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.
 */
package com.mycompany.psc.exercicio06;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] primeiroVetor = new int[8];
        int[] segundoVetor = new int[8];
        ArrayList<Integer> numerosIntercalados = new ArrayList<Integer>();

        System.out.print("PRIMEIRO VETOR\n");

        for (int i = 0; i < primeiroVetor.length; i++) {

            System.out.print((i + 1) + "º Valor: ");
            primeiroVetor[i] = ler.nextInt();

        }

        System.out.print("\nSEGUNDO VETOR\n");

        for (int i = 0; i < segundoVetor.length; i++) {

            System.out.print((i + 1) + "º Valor: ");
            segundoVetor[i] = ler.nextInt();

        }

        for (int j = 0; j < primeiroVetor.length; j++) {

            numerosIntercalados.add(primeiroVetor[j]);
            numerosIntercalados.add(segundoVetor[j]);

        }
        
        System.out.print("\nNúmeros intercalados\n");

        for (int numeros : numerosIntercalados){
                
                System.out.print(numeros + ", ");
                
        }

    }
}
