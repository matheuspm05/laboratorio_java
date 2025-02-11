/*fazer uma calculador em java
 *usar switch case
 *
 *
 *
 */
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("--------------------------");
        System.out.println("\tMENU");
        System.out.println("--------------------------");
        System.out.printf("[1] ADIÇÃO (+)\n");
        System.out.printf("[2] SUBTRAÇÃO (-)\n");
        System.out.printf("[3] MULTIPLICAÇÃO (*)\n");
        System.out.printf("[4] DIVISÃO (/)\n");
        System.out.println("[0] SAIR");
        System.out.print("\nEscolha a Opção: ");

        opcao = scan.nextInt();
        System.out.printf("A Opção escolhida é: %d\n", opcao);

        if (opcao == 0) {
            System.out.println("Você escolheu SAIR");
        } else if (opcao >= 1 && opcao <= 4) {
            System.out.println("Você escolheu uma operação válida.");
        } else {
            System.out.println("ERROR: Opção errada!");
        }

       // switch 
        scan.close();
    }
}
