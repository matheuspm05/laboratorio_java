
import java.util.Scanner;

public class Banco {

    public static void Menu(Conta c1) {
        System.out.println("------------------------------------------");
        System.out.println("DIGITE 1 (CONSULTAR SALDO)");
        System.out.println("DIGITE 2 (CONSULTAR LIMITE)");
        System.out.println("DIGITE 3 (SACAR)");
        System.out.println("DIGITE 4 (DEPOSITAR)");
        System.out.println("DIGITE 5 (CASAR)");
        System.out.println("DIGITE 6 (VISUALIZAR CONJUGE)");
        System.out.println("DIGITE 0 (SAIR)");
        System.out.println("------------------------------------------");
    }

    public static void valorConta(Conta c1) {
        System.out.println("------------------------------------------");
        System.out.println("VALOR SALDO: " + c1.saldo);
    }

    public static void informacoes(Conta c1) {
        System.out.println("------------------------------------------");
        System.out.println("NUMERO CONTA: " + c1.numero);
        System.out.println("SEU NOME: " + c1.titular.nome);
        System.out.println("SEU SOBRENOME: " + c1.titular.sobrenome);
        System.out.println("SEU CPF: " + c1.titular.cpf);

        if (c1.titular.conjuge != null) {
            System.out.println("ESPOSO/A: " + c1.titular.conjuge.nome + " " + c1.titular.conjuge.sobrenome);
        } else {
            System.out.println("NÃO ESTÁ CASADO.");
        }

        System.out.println("------------------------------------------");
        System.out.println("LIMITE DISPONÍVEL: " + c1.limite);
        System.out.println("SALDO FINAL: " + c1.saldo);
        System.out.println("------------------------------------------");

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
            Menu(c1);
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    valorConta(c1);
                    break;
                case 2:
                    c1.valorLim();
                    break;
                case 3:
                    System.out.print("DIGITE O VALOR QUE QUEIRA SACAR: ");
                    valor = scan.nextInt();
                    c1.sacar(valor);
                    break;
                case 4:
                    System.out.print("DIGITE O VALOR QUE QUEIRA DEPOSITAR: ");
                    valor = scan.nextInt();
                    c1.depositar(valor);
                    valorConta(c1);
                    break;
                case 5:
                    Cliente conjuge = new Cliente();

                    scan.nextLine();
                    System.out.println("DIGITE O NOME DO CÔNJUGE: ");
                    conjuge.nome = scan.nextLine();

                    System.out.println("DIGITE O SOBRENOME DO CÔNJUGE: ");
                    conjuge.sobrenome = scan.nextLine();

                    System.out.println("DIGITE O CPF DO CÔNJUGE: ");
                    conjuge.cpf = scan.nextLine();

                    c1.titular.casar(conjuge);
                    break;
                case 6:
                    c1.titular.mostraConjuge();
                    break;
                default:
                    System.out.println("VOCE ESCOLHEU SAIR!");
                    break;
            }
        
        } while (opcao != 0);

        informacoes(c1);

        scan.close();
    }
}
