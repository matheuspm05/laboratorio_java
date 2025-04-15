public class Main {

    public static void main(String[] args) {

        AgdTelefonicaNormal agenda1 = new AgdTelefonicaNormal("teste", "0000");
        AgdTelefonicaObj agenda2 = new AgdTelefonicaObj("ts", "teste", 0000);
        AgdTelefonicaLs agenda3 = new AgdTelefonicaLs("teste:0000");
        AgdTelefonicaListaObj agenda4 = new AgdTelefonicaListaObj("testes", 0000);
        // agenda 1
        /* 
        agenda1.inserir("matheus", "289999332");
        agenda1.inserir("João", "289998441");
        agenda1.inserir("Davi", "289992222");
        agenda1.remover("João");

        System.out.println("Número de Matheus: " + agenda1.buscarNumero("matheus"));
        System.out.println("Tamanho da agenda: " + agenda1.tamanho());

        agenda1.printar();

        // agenda 2
        agenda2.inserir("simo", new Pessoa("gabriel", 22222));
        agenda2.inserir("nigel", new Pessoa("simonaci", 242233));
        agenda2.inserir("cratiel", new Pessoa("volpini", 2734422));
        agenda2.remover("nigel");

        System.out.println("\nPessoa encontrada: " + agenda2.buscarPessoa("simo"));

        System.out.println("\nContatos completos:");
        agenda2.printarObj();
        
        //agenda 3
        System.out.println("escrever nesse formato");
        System.out.println("nome:numero \n");

        agenda3.inserir("miguel:99999");
        agenda3.inserir("lois:223223");
        agenda3.inserir("daniel:4242");

        System.out.println("pessoa: " + agenda3.buscarPessoa("miguel"));

        System.out.println("\n Tamanho da agenda: " + agenda3.tamanho());

        agenda3.printar();
        */
        // agenda4 

        agenda4.inserir("joao", 55555);
        agenda4.inserir("jose", 66666);
        agenda4.inserir("joakin", 88888);

        System.out.println(agenda4.buscarPessoa("joao"));

        agenda4.remover("joakin");

        agenda4.printar();


    }
}
