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

    public abstract void listarAnimais();

    protected void adicionarAnimal(Animal animal) {
        int idAnimal = animal.getId();
        boolean existe = false;

        for (Animal a : animais) {
            if (a.getId() == idAnimal) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("\nANIMAL COM ID JA EXISTENTE.");
        } else {
            animais.add(animal);
        }
    }

    protected void removerAnimal(Animal animal) {
        int idAnimal = animal.getId();
        boolean removido = false;
        Iterator<Animal> iterator = animais.iterator();

        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == idAnimal) {
                iterator.remove();
                System.out.println("\nANIMAL REMOVIDO COM SUCESSO!");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("\nANIMAL NÃO ENCONTRADO.");
        }
    }

}
