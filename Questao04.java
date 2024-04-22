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
        int[] numeroVoo = new int[12];
        int[] lugaresDisponiveis = new int[12];

        int opcao;

        System.out.print("BEM VINDO!!!\n"
                + "AEROPORTO\n");

        for (int i = 0; i < 2; i++) {

            System.out.print("\nNúmero do voo: ");
            numeroVoo[i] = ler.nextInt();
            ler.nextLine();
            System.out.print("Origem: ");
            origem[i] = ler.nextLine();
            System.out.print("Destino: ");
            destino[i] = ler.nextLine();
            System.out.print("Número de lugares disponivel: ");
            lugaresDisponiveis[i] = ler.nextInt();
            ler.nextLine();

        }

        while (true) {
            
            System.out.print("\n1 - CONSULTAR\n"
                    + "2 - EFETUAR RESERVA\n"
                    + "3 - SAIR\n"
                    + "INFORME: ");
            opcao = ler.nextInt();

            if (opcao == 1) {

                System.out.print("CONSULTAR\n\n"
                        + "1 - Número do voo\n"
                        + "2 - Origem\n"
                        + "3 - Destino\n"
                        + "Informe: ");
                opcao = ler.nextInt();

                if (opcao == 1) {

                    System.out.print("\nQual o número do voo: ");
                    int consultarNumeroVoo = ler.nextInt();

                    for (int i = 0; i < numeroVoo.length; i++) {

                        if (consultarNumeroVoo == numeroVoo[i]) {

                            System.out.println("\nNúmero do Voo: " + numeroVoo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponiveis: " + lugaresDisponiveis[i] + "\n");

                        }

                    }

                }

                if (opcao == 2) {

                    System.out.print("\nQual a origem: ");
                    ler.nextLine();
                    String consultarOrigem = ler.nextLine();

                    for (int i = 0; i < origem.length; i++) {

                        if (consultarOrigem.equalsIgnoreCase(origem[i])) {

                            System.out.println("\nNúmero do Voo: " + numeroVoo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponiveis: " + lugaresDisponiveis[i] + "\n");

                        }

                    }

                }

                if (opcao == 3) {

                    System.out.print("\nQual o destino: ");
                    ler.nextLine();
                    String consultarDestino = ler.nextLine();

                    for (int i = 0; i < destino.length; i++) {

                        if (consultarDestino.equalsIgnoreCase(destino[i])) {

                            System.out.println("\nNúmero do Voo: " + numeroVoo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponiveis: " + lugaresDisponiveis[i] + "\n");

                        }

                    }

                }

            } else if (opcao == 2) {
                
                System.out.println("\nEFETUAR RESERVA");
                System.out.print("Informe o número do voo: ");
                int reservarNumeroVoo = ler.nextInt();
                
                for (int i = 0; i < numeroVoo.length; i++){
                    
                    if (reservarNumeroVoo == numeroVoo[i]) {
                        
                        if (lugaresDisponiveis[i] >= 1){
                            
                        System.out.print("RESERVA CONFIRMADA\n");
                        
                        lugaresDisponiveis[i] -= 1;
                        
                        break;
                        
                        } else {
                            
                            System.out.print("VOO LOTADO\n");
                            
                            break;
                            
                        }
                        
                    }
                        System.out.print("VOO INEXISTENTE\n");
                        
                        break;

                } 
                

            } else if (opcao == 3){
                
                break;
                
            } else {
                
                while (opcao != 1 || opcao != 2 || opcao != 2){
                    
                    System.out.print("VALOR INVALIDO");
                    opcao = ler.nextInt();
                    
                }
                
            }
        }
    }
}
