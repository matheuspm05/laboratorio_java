package main.classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class LocalDeAnimal {
    private List<Animal> animais = new ArrayList<>();

    public List<Animal> getAnimais() {
        return animais;
    }

    public abstract void limpar();

    public void adicionarAnimal(Animal animal) {
        int idAnimal = animal.getId();
        boolean existe = false;

        for (Animal a : animais) {
            if (a.getId() == idAnimal) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("ANIMAL COM ID JA EXISTENTE.");
        } else {
            animais.add(animal);
            System.out.println("ANIMAL ADICIONADO COM SUCESSO.");
        }
    }

    public void removerAnimal(Animal animal) {
        int idAnimal = animal.getId();
        boolean removido = false;
        Iterator<Animal> iterator = animais.iterator();

        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == idAnimal) {
                iterator.remove();
                System.out.println("ANIMAL REMOVIDO COM SUCESSO!");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("ANIMAL NÃO ENCONTRADO.");
        }
    }

    public void listarAnimais() {
        System.out.println("\tTODOS ANIMAIS:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

    }
}
