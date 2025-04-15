public class Main {

    public static void main(String[] args) {

        AgdTelefonicaNormal agenda1 = new AgdTelefonicaNormal();
        AgdTelefonicaObj agenda2 = new AgdTelefonicaObj();

        // agenda 1
        agenda1.inserir("matheus", "289999332");
        agenda1.inserir("João", "289998441");
        agenda1.inserir("Davi", "289992222");

        System.out.println("Número de Matheus: " + agenda1.buscarNumero("matheus"));

        agenda1.remover("João");

        System.out.println("Tamanho da agenda: " + agenda1.tamanho());

        agenda1.printar();

        // agenda 2
        agenda2.inserir("simo", new Pessoa("gabriel", 22222));
        agenda2.inserir("nigel", new Pessoa("simonaci", 242233));
        agenda2.inserir("cratiel", new Pessoa("volpini", 2734422));

        Pessoa p = agenda2.buscarPessoa("nigel");
        System.out.println("\nPessoa encontrada: " + p);

        
        System.out.println("\nContatos completos:");
        agenda2.printarObj();
    }
}
