import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String nome;
    private List<Aluno> alunos;

    public Professor(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    public void addAlunos(Aluno aluno) {
        alunos.add(aluno);
        aluno.setProfessor(this); 
    }

    public String getNome() {
        return nome;
    }

    public void imprimirAlunos() {
        for (Aluno al : alunos) {
            System.out.println(al);
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
