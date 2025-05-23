package main.classes;

public class Remedio {

    private String nome;
    private String dose;

    // constutor
    public Remedio(String nome, String dose) {
        this.nome = nome;
        this.dose = dose;
    }

    // gets
    public String getNome() {
        return nome;
    }

    public String getDose() {
        return dose;
    }

    @Override
    public String toString() {
        return "\nTIPO: REMÉDIO" +
                "\nNOME: " + nome +
                "\nDOSE: " + dose;
    }

}
