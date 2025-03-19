
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("rafael");
        Aluno aluno2 = new Aluno("matheus", "CC", "CCM", 1);

        aluno1.setNota1(12);
        aluno1.setNota2(7);
        aluno1.passar();

        aluno2.setNota1(8);
        aluno2.setNota2(8);
        aluno2.passar();

        System.out.println("-------------------------------");
        System.out.println("\tEXIBIR ALUNOS:");
        System.out.println("Quantidade Alunos: " + Aluno.getqutAlunos());

        aluno1.imprimirDados();

        aluno2.imprimirDados();

        System.out.printf("-------------------------------");

    }
}
