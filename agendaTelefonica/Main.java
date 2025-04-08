
public class Main {

    public static void main(String[] args) {

        AgendaTelefonica agenda1 = new AgendaTelefonica();

        agenda1.inserir("matheus", "289999332");
        agenda1.inserir("João", "289998441");
        agenda1.inserir("Davi", "289992222");
        
        System.out.println("Número de Matheus: " + agenda1.buscarNumero("matheus"));

        agenda1.remover("João");

        
        System.out.println("Tamanho da agenda: " + agenda1.tamanho());

        //agenda1.printar();
    }
}
