/*1 - Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.*/
package com.mycompany.psc.exercicio06;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[9];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();

        }

        for (int j = 0; j < numeros.length; j++) {

            contador = 0;
            
            for (int index = 1; index <= numeros[j]; index++) {
              

                if (numeros[j] % index == 0) {

                    contador++;

                } 

            }

            if (contador <= 2) {

                System.out.println(+numeros[j] + " É PRIMO, POSIÇÃO " + (j + 1));

            } else {
                
                
                
            }
        }
    }
}
