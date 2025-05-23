package main.classes;

public class Curral extends LocalDeAnimal {
    private int id;
    private int capacidadeMaxima;

    // constutor
    public Curral(int id, int capacidade) {
        this.id = id;
        this.capacidadeMaxima = capacidade;
    }

    // gets
    public int getId() {
        return id;
    }

    public int getCapacidade() {
        return capacidadeMaxima;
    }

    @Override
    public void limpar() {
        System.out.println("LIMPANDO O CURRAL!");
    }

    @Override
    public String toString() {
        return "\nTIPO: CURRAL" +
                "\nID: " + id +
                "\nCAPACIDADE MÁXIMA: " + capacidadeMaxima;
    }

}
