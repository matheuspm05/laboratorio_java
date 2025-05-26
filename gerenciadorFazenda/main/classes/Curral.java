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
        System.out.println("\nLIMPANDO O CURRAL!");
    }

    @Override
    public void listarAnimais() {
        System.out.println("\tTODOS ANIMAIS DO CURRAL " + id + ":");
        for (Animal animal : getAnimais()) {
            System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        return "\nTIPO: CURRAL" +
                "\nID: " + id +
                "\nCAPACIDADE MÁXIMA: " + capacidadeMaxima;
    }

}
