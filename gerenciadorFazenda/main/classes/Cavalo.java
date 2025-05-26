package main.classes;

public class Cavalo extends Animal {
    private String cor;

    public Cavalo(int id, String nome, String idade, String peso, String cor) {
        super(id, nome, idade, peso);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\tINFORMAÇOES SOBRE O CAVALO");
        System.out.println("\nID: " + getId() + "\nNOME: " + getNome() + "\nIDADE: " + getIdade() +
                "\nPESO: " + getPeso() + "\nCOR: " + cor);

        System.out.println("\nREMEDIOS USADOS:");
        for (Remedio remedio : getHistoricoRemedios()) {
            System.out.println(remedio.getNome());
        }
    }

    @Override
    public String toString() {
        return "\nTIPO: CAVALO" + super.toString() + "\nCOR: " + cor;
    }

}
