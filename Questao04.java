/*Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). 
Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
consultar;
efetuar reserva; e
sair.
Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções:
por número do voo;
por origem; e
por destino.
Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. O programa deverá dar as seguintes respostas:
reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
voo lotado — caso não exista lugar disponível nesse voo;
voo inexistente — caso o código do voo não exista.
A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de consulta ou reserva, o programa volta ao menu principal.
 */
package com.mycompany.psc.exercicio06;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] origem = new String[12];
        String[] destino = new String[12];
        String[] numeroVoo = new String[12];
        int[] lugaresDisponiveis = new int[12];

        int opcao;

        for (int i = 0; i < numeroVoo.length; i++ ) {
            
            System.out.print("BEM VINDO!!!\n"
                    + "AEROPORTO\n\n"
                    + "Número do voo: ");
            numeroVoo[i] = ler.nextLine();
            System.out.print("Origem: ");
            origem[i] = ler.nextLine();
            System.out.print("Destino: ");
            destino[i] = ler.nextLine();
            System.out.print("Número de lugares disponivel: ");
            lugaresDisponiveis[i] = ler.nextInt();
            
        }

        System.out.print("1 - CONSULTAR\n"
                + "2 - EFETUAR RESERVA\n"
                + "3 - SAIR\n"
                + "INFORME: ");
        opcao = ler.nextInt();
        
        if (opcao == 1){
            
            System.out.print("CONSULTAR\n\n"
                    + "1 - Número do voo\n"
                    + "2 - Origem\n"
                    + "3 - Destino\n"
                    + "Informe: ");
            opcao = ler.nextInt();
            
            if (opcao == 1){
                
                System.out.print("Qual o número do voo");
                
                
                for (int i = 0; i < )
                
            }
            
            
        }

    }
}
