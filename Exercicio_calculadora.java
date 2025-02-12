/*fazer uma calculador em java
 *usar switch case
 *
 *
 *
 */
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        for(opcao =1; opcao!=0; opcao=opcao){
        System.out.println("--------------------------");
        System.out.println("\tMENU");
        System.out.println("--------------------------");
        System.out.printf("[1] ADIÇÃO (+)\n");
        System.out.printf("[2] SUBTRAÇÃO (-)\n");
        System.out.printf("[3] MULTIPLICAÇÃO (*)\n");
        System.out.printf("[4] DIVISÃO (/)\n");
        System.out.println("[0] SAIR");
        System.out.printf("\nEscolha a Opção: ");

        opcao = scan.nextInt();
        /*
         * if (opcao == 0) {
         * System.out.println("Você escolheu SAIR");
         * } else if (opcao >= 1 && opcao <= 4) {
         * System.out.println("Você escolheu uma operação válida.");
         * } else {
         * System.out.println("ERROR: Opção errada!");
         * }
         */
        switch (opcao) {
            case 0:
                System.out.println("Você escolheu: SAIR");
                break;
            case 1:
                System.out.println("Você escolheu: SOMA");
                break;
            case 2:
                System.out.println("Você escolheu: SUBTRAÇÃO");
                break;
            case 3:
                System.out.println("Você escolheu: MULTIPLICAÇÃO");
                break;
            case 4:
                System.out.println("Você escolheu: DIVISÃO");
                break;
            default:
                System.out.println("Opção inválida! digite um numero entre (0 e 4)");
        }
       
        }
         scan.close();
    }
}
