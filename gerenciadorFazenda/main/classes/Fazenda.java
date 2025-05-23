package main.classes;

import java.util.List;
import java.util.ArrayList;

public class Fazenda {
    private String nome;
    private String idadeFazenda;
    private DonoFazenda donoFazenda;
    private List<Animal> animais;
    private List<Pasto> pastos;
    private List<Curral> currais;
    private List<Campeiro> campeiros;
    private List<Remedio> remedios;

    // constutor
    public Fazenda(String nome, String idadeFazenda, DonoFazenda donoFazenda) {
        this.nome = nome;
        this.idadeFazenda = idadeFazenda;
        this.donoFazenda = donoFazenda;
        animais = new ArrayList<>();
        pastos = new ArrayList<>();
        currais = new ArrayList<>();
        campeiros = new ArrayList<>();
        remedios = new ArrayList<>();
    }

    // gets
    public String getNome() {
        return nome;
    }

    public String getIdadeFazenda() {
        return idadeFazenda;
    }

    public DonoFazenda getDonoFazenda() {
        return donoFazenda;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Pasto> getPastos() {
        return pastos;
    }

    public List<Curral> getCurrais() {
        return currais;
    }

    public List<Campeiro> getCampeiros() {
        return campeiros;
    }

    public List<Remedio> getRemedios() {
        return remedios;
    }

    // metodos
    public void adicionarDono(DonoFazenda donoFazenda) {
        this.donoFazenda = donoFazenda;
    }

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

    // teste
    public void listarAnimais() {
        System.out.println("\tTODOS ANIMAIS NA FAZENDA:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

    }

    public void adicionarPasto(Pasto pasto) {
        int idPasto = pasto.getId();
        boolean existe = false;

        for (Pasto p : pastos) {
            if (p.getId() == idPasto) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("PASTO COM ID JA EXISTENTE.");
        } else {
            pastos.add(pasto);
            System.out.println("PASTO ADICIONADO COM SUCESSO.");
        }
    }

    public void adicionarCurral(Curral curral) {
        int idCurral = curral.getId();
        boolean existe = false;

        for (Curral c : currais) {
            if (c.getId() == idCurral) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("CURRAL COM ID JA EXISTENTE.");
        } else {
            currais.add(curral);
            System.out.println("CURRAL ADICIONADO COM SUCESSO.");
        }
    }

    public void adicionarCampeiro(Campeiro campeiro) {
        int idCampeiro = campeiro.getId();
        boolean existe = false;

        for (Campeiro c : campeiros) {
            if (c.getId() == idCampeiro) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("CAMPEIRO COM ID JA EXISTENTE.");
        } else {
            campeiros.add(campeiro);
            System.out.println("CAMPEIRO ADICIONADO COM SUCESSO.");
        }
    }

    public void adicionarRemedio(Remedio remedio) {
        remedios.add(remedio);
        System.out.println("REMEDIO ADICIONADO COM SUCESSO.");
    }

    public void moverAnimalParaPasto(int animalId, int pastoId) {
        Animal animalParaMover = null;
        boolean pastoEncontrado = false;

        for (Animal a : animais) {
            if (a.getId() == animalId) {
                animalParaMover = a;
                break;
            }
        }

        if (animalParaMover == null) {
            System.out.println("ANIMAL NÃO ENCONTRADO.");
            return;
        }

        animais.remove(animalParaMover);

        for (Pasto p : pastos) {
            if (p.getId() == pastoId) {
                p.adicionarAnimal(animalParaMover);
                pastoEncontrado = true;
                System.out.println("ANIMAL MOVIDO COM SUCESSO PARA O PASTO " + pastoId);
                break;
            }
        }

        if (!pastoEncontrado) {
            System.out.println("PASTO NÃO ENCONTRADO. ANIMAL SERÁ READICIONADO À LISTA PRINCIPAL.");
            animais.add(animalParaMover);
        }
    }

    public void moverAnimalParaCurral(int animalId, int curralId) {
        Animal animalParaMover = null;
        boolean curralEncontrado = false;

        for (Animal a : animais) {
            if (a.getId() == animalId) {
                animalParaMover = a;
                break;
            }
        }

        if (animalParaMover == null) {
            System.out.println("ANIMAL NÃO ENCONTRADO.");
            return;
        }

        animais.remove(animalParaMover);

        for (Curral c : currais) {
            if (c.getId() == curralId) {
                c.adicionarAnimal(animalParaMover);
                curralEncontrado = true;
                System.out.println("ANIMAL MOVIDO COM SUCESSO PARA O CURRAL " + curralId);
                break;
            }
        }

        if (!curralEncontrado) {
            System.out.println("CURRAL NÃO ENCONTRADO. ANIMAL SERÁ READICIONADO À LISTA PRINCIPAL.");
            animais.add(animalParaMover);
        }
    }

    public void estruturaFazenda() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("\tINFORMAÇOES COMPLETA SOBRE A FAZENDA");
        System.out.println("\nNOME: " + nome + "\nIDADE DA FAZENDA: " + idadeFazenda + donoFazenda);

       

        System.out.println("\n\tPASTOS");
        for (Pasto p : pastos) {
            System.out.println(p);
        }

        System.out.println("\n\tCURRAIS");
        for (Curral c : currais) {
            System.out.println(c);
        }

        System.out.println("\n\tCAMPEIROS");
        for (Campeiro c : campeiros) {
            System.out.println(c);
        }

        System.out.println("\n\tANIMAIS");
        for (Animal a : animais) {
            System.out.println(a);
        }

        System.out.println("\n\tREMEDIOS");
        for (Remedio r : remedios) {
            System.out.println(r);
        }
    }

    @Override
    public String toString() {
        return "\nNOME: " + nome + "\nIDADE DA FAZENDA: " + idadeFazenda + "\nDONO: " + donoFazenda;
    }

}
