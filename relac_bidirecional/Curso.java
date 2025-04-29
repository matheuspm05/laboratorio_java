import java.util.List;
import java.util.ArrayList;

public class Curso {
	private String nome;
	private List<Estudante> estudantes;

	public Curso(String nome) {
		this.nome = nome;
		estudantes = new ArrayList<>();
	}

	public void addEstudante(Estudante estudante) {
		if (!estudantes.contains(estudante)) {
			estudantes.add(estudante);
			estudante.inscreverEmCurso(this);
		}

	}

	public String getNome() {
		return nome;
	}


	public void imprimirEstudantes() {
		System.out.println("+--------------------------------------------+");
		System.out.println("| Curso: " + nome);
		System.out.println("| Nome dos estudantes \n" + "|");
		for (Estudante estudante : estudantes) {
			System.out.println("| - " + estudante);
		}
		System.out.println("+--------------------------------------------+");
	}


	@Override
	public String toString() {
		return "Curso: " + nome;
	}
}
