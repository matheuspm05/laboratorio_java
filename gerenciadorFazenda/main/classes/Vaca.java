package main.classes;

public class Vaca extends Animal {
    private String litrosLeite;

    public Vaca(int id, String nome, String idade, String peso, String litrosLeite) {
        super(id, nome, idade, peso);
        this.litrosLeite = litrosLeite;

    }

    public String getLitrosLeite() {
        return litrosLeite;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\tINFORMAÇOES SOBRE A VACA");
        System.out.println("\nID: " + getId() + "\nNOME: " + getNome() + "\nIDADE: " + getIdade() +
                "\nPESO: " + getPeso() + "\nTOTAL DE LEITE: " + litrosLeite);

        System.out.println("\nREMEDIOS USADOS:");
        for (Remedio remedio : getHistoricoRemedios()) {
            System.out.println(remedio.getNome());
        }
    }

    @Override
    public String toString() {
        return "\nTIPO: VACA" + super.toString() + "\nLITROS DE LEITE: " + litrosLeite;
    }

}
