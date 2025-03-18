/******************************************************************************
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
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		Aluno aluno1 = new Aluno("matheus");
		
		System.out.println(aluno1.nome);
		System.out.println(Aluno.getqutAlunos());
		
		
	}
}
