/*3 - Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. 
O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. 
Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.*/
package com.mycompany.psc.exercicio06;
import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int[] numeros = new int[8];
        ArrayList<Integer> numerosPositivos = new ArrayList<Integer>();
        ArrayList<Integer> numerosNegativos = new ArrayList<Integer>();
        
        for (int i = 0; i < numeros.length; i++){
            
            System.out.print((i + 1) + "º Valor: ");
            numeros[i] = ler.nextInt();
            
            if (numeros[i] < 0){
                
                numerosNegativos.add(numeros[i]);
                
            } else {
                
                numerosPositivos.add(numeros[i]);
                
            }
            
        }
        
        System.out.print("Números Negativos\n");
        
        for (int negativos : numerosNegativos){
            
            System.out.print(negativos + " ");
            
        }
        
        System.out.print("\n\nNúmeros Positivos\n");
        
        for (int positivos : numerosPositivos){
            
            System.out.print(positivos + " ");
            
        }
        
    }
}
