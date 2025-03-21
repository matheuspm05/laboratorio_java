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
    
    private static int qntAlunos = 0;
    
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private String situação;
    private int periodo;
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
        this.nome = nome.toUpperCase();
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
        System.out.println("\nMatrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Curso: " + (this.curso != null ? this.curso : "Não informado"));
        System.out.println("Turma: " + (this.turma != null ? this.turma : "Não informado"));
        System.out.println("Período: " + (this.periodo != 0 ? this.periodo : "Não informado"));
        System.out.println("Nota 1: " +  this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota Final: " + this.notaFinal);
        System.out.println("Situação: " + (this.situação != null ? this.situação : "Não calculada"));
    }
    

    // matricula
    private void gerarMatricula() {
        int anoInt = Year.now().getValue();
        int aleatorioInt;
       
        Random random = new Random();
        aleatorioInt = random.nextInt(9999);

        matricula = anoInt + String.format("%04d", aleatorioInt);
    }

    private void calcularMedia() {
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
