/*
Crie uma classe aluno que possua.

Matrícula (String) – gerada automaticamente, 8 digitos, iniciados com o ano+4aleatorios. Ex. 20230000.
Nome (String) - Sempre registado com letra maiúscula.
Curso (String)
Turma (Char ou String)
Periodo (int)
Nota 1B (double)
Nota 2B (double)
Nota Final (double)
Quantidade de Alunos (Int static)

Com os métodos:

Pelo menos 2 construtores.
Get/Set
Imprimir – Imprime os dados do aluno de forma formatada.
Passar – Modifica turma e período.
Calcular Final – Calcula a média das notas do aluno. 
*/

import java.time.Year;
import java.util.Random;

public class Aluno {

    private String matricula;
    String nome;
    String curso;
    String turma;
    String situação;
    int periodo;
    int ano = Year.now().getValue();
    static int qntAlunos;
    private double nota1;
    private double nota2;
    private double notaFinal;

    // construtores
    public Aluno(String nome) {
        this.nome = nome.toUpperCase();
        qntAlunos++;
        gerarMatricula();
    }

    // construtores
    public Aluno(String nome, String curso, String turma, int periodo) {
        this.nome = nome;
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        qntAlunos++;

        gerarMatricula();
    }

    // get
    public String getMatricula() {
        return matricula;
    }

    // get
    public static int getqutAlunos() {
        return qntAlunos;
    }

    // get
    public double getnotaFinal() {
        return notaFinal;
    }

    // set
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    // set
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        calcularMedia();
    }

    // menu
    public void imprimirDados() {
        System.out.printf("\nmatricula: " + this.matricula + "\n");
        System.out.println("nome: " + this.nome);
        System.out.println("curso: " + this.curso);
        System.out.println("turma: " + this.turma);
        System.out.println("periodo: " + this.periodo);
        System.out.println("nota1: " + this.nota1);
        System.out.println("nota2: " + this.nota2);
        System.out.println("notaFinal: " + this.notaFinal);
        System.out.println("situação: " + this.situação);
    }

    // matricula
    public void gerarMatricula() {
        int aleatorio;
        String aleatorioStr;
        String ano;

        Random random = new Random();
        aleatorio = random.nextInt(9999);

        aleatorioStr = String.format("%04d", aleatorio);
        ano = String.format("%d", this.ano);

        matricula = ano.concat(aleatorioStr);
    }

    public void calcularMedia() {
        if (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
            System.out.println("ERROR:insira valores entre 0 e 10");
            return;
        } else {
            notaFinal = (nota1 + nota2) / 2;
            if (notaFinal >= 7) {
                situação = "APROVADO";
            } else {
                situação = "REPROVADO";
            }
        }
    }

    public void passar() {
        System.out.printf("\n" + nome + "\n");
        if (notaFinal >= 7) {
            System.out.println("PASSAR: " + situação);
            periodo++;
            if (turma != null) {
                turma = "A"; 
            }
        } else {
            System.out.println("PASSAR: " + situação);
        }
    }
}
