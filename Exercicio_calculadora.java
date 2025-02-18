import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        float numero1, numero2;
    
        do {
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
            
           
            
            if (opcao == 0) {
                System.out.println("Você escolheu SAIR");
                break;
            } else if (opcao >= 1 && opcao <= 4) {
            System.out.println("Você escolheu uma operação válida.");
            
            System.out.println("Escolha o primeiro número:");
            numero1 = scan.nextFloat();
            
            System.out.println("Escolha o segundo número:");
            numero2 = scan.nextFloat();
            
                switch (opcao) {
                    case 1:
                        System.out.printf("RESULTADO SOMA: %.2f\n", numero1 + numero2);
                        break;
                    case 2:
                        System.out.printf("RESULTADO SUBTRAÇÃO: %.2f\n", numero1 - numero2);
                        break;
                    case 3:
                        System.out.printf("RESULTADO MULTIPLICAÇÃO: %.2f\n", numero1 * numero2);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.printf("RESULTADO DIVISÃO: %.2f\n", numero1 / numero2);
                        } else {
                            System.out.println("ERROR: Não é possível dividir por zero.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } else {
                System.out.println("ERROR: Opção inválida!");
            }
            
        } while(opcao != 0);

        scan.close();
    }
}
