package main.classes;

import java.util.List;
import java.util.ArrayList;

public abstract class Animal {
    private int id;
    private String nome;
    private String idade;
    private String peso;
    private String localizacao;

    private List<Remedio> historicoRemedios;

    // constutor
    public Animal(int id, String nome, String idade, String peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        historicoRemedios = new ArrayList<>();
    }

    // gets
    public int getId() {
        return id;
    }

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getPeso() {
        return peso;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Remedio> getHistoricoRemedios() {
        return historicoRemedios;
    }

    public abstract void exibirInformacoes();

    public void aplicarRemedio(Remedio remedio) {
        System.out.println("\nAPLICANDO REMEDIO " + remedio.getNome());
        System.out.println("DOSE: " + remedio.getDose());
        historicoRemedios.add(remedio);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNOME: " + nome + "\nIDADE: " + idade + "\nPESO: " + peso + "\nLOCALIZAÇÃO: "
                + localizacao;
    }
}
