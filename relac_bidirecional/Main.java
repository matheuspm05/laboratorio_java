public class Main {
    public static void main(String[] args) {
        // exemplo 1:n aluno e professor
        /* 
        Professor p1 = new Professor("CASSIO");
        
        Aluno a1 = new Aluno("JOSE");
        Aluno a2 = new Aluno("JOAO");
        Aluno a3 = new Aluno("JULIA");
        Aluno a4 = new Aluno("JOAQUIN");
        Aluno a5 = new Aluno("JOSIADO");
        
        p1.addAlunos(a1);
        p1.addAlunos(a2);
        p1.addAlunos(a3);
        p1.addAlunos(a4);
        p1.addAlunos(a5);
        
        p1.imprimirAlunos();
        */
        
        // exemplo n:m curso e estudante

        Curso c1 = new Curso("ciencia da computação");
        Curso c2 = new Curso("medicina");

        Estudante e1 = new Estudante("lucas");
        Estudante e2 = new Estudante("yago");
        Estudante e3 = new Estudante("vinicius");

        e1.inscreverEmCurso(c1);
        e1.inscreverEmCurso(c2);
        e2.inscreverEmCurso(c1);
        e3.inscreverEmCurso(c2);

        c1.imprimirEstudantes();



    }
}
