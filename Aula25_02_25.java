package com.mycompany.aula25_02_25;

import java.util.Scanner;

public class Aula25_02_25 {

    public static void main(String[] args) {
        int valor, opcao = -1;

        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta();

        System.out.println("------------------------------------------");
        System.out.println("CRIAR UMA CONTA");
        System.out.println("------------------------------------------");

        System.out.println("DIGITE O NUMERO DA CONTA:");
        c1.numero = scan.nextInt();
        scan.nextLine();
        
        System.out.println("DIGITE SEU NOME:");
        c1.nome = scan.nextLine();

        do {
            System.out.println("DIGITE 1 (SACAR)");
            System.out.println("DIGITE 2 (DEPOSITAR)");
            System.out.println("DIGITE 0 (SAIR)");
            opcao = scan.nextInt();
            if(opcao == 1){
                System.out.println("DIGITE O VALOR QUE QUEIRA SACAR:)");
                valor = scan.nextInt();
                
            }
            
        } while (opcao != 0);
        
       scan.close();
    }

}

