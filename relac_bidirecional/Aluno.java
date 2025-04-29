public class Aluno {
    private String nome;
    private Professor professor;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "nome aluno: " + nome + "\nprofessor: " + professor;
    }
}
