import java.util.Scanner;

public class exercicio {
    
    public static float soma(float num1, float num2){
        return num1 + num2;
    }
    public static float subtracao(float num1, float num2){
        return num1 - num2;
    }
    public static float multiplicacao(float num1, float num2){
        return num1 * num2;
    }
    public static float divisao(float num1, float num2){
        if(num2 != 0){
        return num1 / num2;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        float numero1, numero2;
    
        do {
            System.out.printf("=======================================\n");
            System.out.printf("\t %s", "CALCULADORA\n");
            System.out.printf("=======================================\n");
            System.out.println("\t[1] Adição (+)");
            System.out.println("\t[2] Subtração (-)");
            System.out.println("\t[3] Multiplicação (*)");
            System.out.println("\t[4] Divisão (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=======================================\n");
            System.out.printf("Escolha uma opção: ");
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
                        System.out.printf("RESULTADO SOMA: %.0f\n", soma(numero1, numero2));
                        break;
                    case 2:
                        System.out.printf("RESULTADO SUBTRAÇÃO: %.0f\n", subtracao(numero1, numero2));
                        break;
                    case 3:
                        System.out.printf("RESULTADO MULTIPLICAÇÃO: %.0f\n", multiplicacao(numero1, numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.printf("RESULTADO DIVISÃO: %.2f\n", divisao(numero1, numero2));
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
