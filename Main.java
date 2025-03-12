
import java.util.Scanner;

public class Main {

    public static void valorConta(Conta c1) {
        System.out.println("------------------------------------------");
        System.out.println("VALOR DA CONTA: " + c1.saldo);
    }

    public static void main(String[] args) {
        int valor, opcao = -1;

        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta();
    // c1.titular = new Cliente();
        

        System.out.println("------------------------------------------");
        System.out.println("CRIAR UMA CONTA");
        System.out.println("------------------------------------------");

        System.out.print("DIGITE O NÚMERO DA CONTA: ");
        c1.numero = scan.nextInt();
        scan.nextLine();

        System.out.print("DIGITE SEU NOME: ");
        c1.titular.nome = scan.nextLine();
        
        System.out.print("DIGITE SEU SOBRENOME: ");
        c1.titular.sobrenome = scan.nextLine();
        
        System.out.print("DIGITE SEU CPF: ");
        c1.titular.cpf = scan.nextLine();

        do {
            System.out.println("------------------------------------------");
            System.out.println("DIGITE 1 (CONSULTAR SALDO)");
            System.out.println("DIGITE 2 (SACAR)");
            System.out.println("DIGITE 3 (DEPOSITAR)");
            System.out.println("DIGITE 0 (SAIR)");
            System.out.println("------------------------------------------");
            opcao = scan.nextInt();

            if (opcao == 1) {
                valorConta(c1);
            } else if (opcao == 2) {
                System.out.print("DIGITE O VALOR QUE QUEIRA SACAR: ");
                valor = scan.nextInt();
                c1.sacar(valor);

                valorConta(c1);
            } else if (opcao == 3) {
                System.out.print("DIGITE O VALOR QUE QUEIRA DEPOSITAR: ");
                valor = scan.nextInt();
                c1.depositar(valor);
                valorConta(c1);
            } else {
                System.out.println("VOCE ESCOLHEU SAIR!");
            }

        } while (opcao != 0);

        System.out.println("------------------------------------------");
        System.out.println("NUMERO CONTA: " + c1.numero);
        System.out.println("SEU NOME: " + c1.titular.nome);
        System.out.println("SEU SOBRENOME: " + c1.titular.sobrenome);
        System.out.println("SEU CPF: " + c1.titular.cpf);
        System.out.println("ESPOSO/A: " + c1.titular.conjuge);
        System.out.println("------------------------------------------");
        System.out.println("LIMITE DISPONÍVEL: " + c1.limite);
        System.out.println("SALDO FINAL: " + c1.saldo);
        System.out.println("------------------------------------------");

        scan.close();
    }
}
