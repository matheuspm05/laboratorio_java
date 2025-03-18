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

public class Aluno{
    
    private String matricula;
    String nome;
    String curso;
    String turma;
    int periodo;
    int ano = Year.now().getValue();
    static int qntAlunos;
    double nota1;
    double nota2;
    double notaFinal;
   
   //construtores
    public Aluno(String nome){
        this.nome = nome.toUpperCase();
        qntAlunos ++;
    }
    //construtores
    public Aluno(String nome, String curso, String turma, int periodo){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        qntAlunos ++;
    }
    //get
     public void getMatricula(){
        System.out.println("matricula: " + this.matricula);
    }
    //set
    public void setMatricula(){
        this.matricula = matricula;
    }
    //get
    public static int getqutAlunos(){
        return qntAlunos;
    }
    
    public void imprimirDados(){
        System.out.println("matricula: " + this.matricula);
        System.out.println("nome: " + this.nome);
        System.out.println("curso: " + this.curso);
        System.out.println("turma: " + this.turma);
        System.out.println("periodo: " + this.periodo);
        System.out.println("nota1: " + this.nota1);
        System.out.println("nota2: " + this.nota2);
        System.out.println("notaFinal: " + this.notaFinal);
    }
    
    public String gerarMatricula(int ano){
        
        Random aleatorio = new Random(1000);
        matricula = aleatorio.concat()
    }
    
    public double calcularMedia(double nota1, double nota2){
        notaFinal = (nota1 + nota2) / 2 ;
        return notaFinal;
    }
}
