public class Pessoa {
    private String nome;
    private int numero ;

    public Pessoa(String nome, int numero ) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getnumero () {
        return numero ;
    }

    @Override
    public String toString() {
        return nome + " = " + numero;
    }
}
