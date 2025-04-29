import java.util.List;
import java.util.ArrayList;

public class Estudante {
    private String nome;
    private List<Curso> cursos;

    public Estudante(String nome) {
        this.nome = nome;
        cursos = new ArrayList<>();
    }

    public void inscreverEmCurso(Curso curso) {
        if (!cursos.contains(curso)) { 
            cursos.add(curso);
            curso.addEstudante(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public void imprimirCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    @Override
    public String toString() {
        return "nome estudante: " + nome;
    }
    
}
