package main.classes;

public class Boi extends Animal {
    private String tipo;

    public Boi(int id, String nome, String idade, String peso, String tipo) {
        super(id, nome, idade, peso);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\tINFORMAÇOES SOBRE O BOI");
        System.out.println("ID: " + getId() + "\nNOME: " + getNome() + "\nIDADE: " + getIdade() +
                "\nPESO: " + getPeso() + "\nTIPO: " + tipo);

        System.out.println("REMEDIOS USADOS:");
        for (Remedio remedio : getHistoricoRemedios()) {
            System.out.println(remedio.getNome());
        }
    }

    @Override
    public String toString() {
        return "\nTIPO: BOI" + super.toString() + "\nRAÇA: " + tipo;
    }

}
