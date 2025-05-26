package main.classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.println("\nERROR: ANIMAL COM ID " + idAnimal + " JA EXISTENTE.");
        } else {
            animais.add(animal);
            animal.setLocalizacao("ANIMAL NA FAZENDA");
            System.out.println("\nANIMAL ADICIONADO COM SUCESSO.");
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
            System.out.println("\nERROR: PASTO COM ID JA EXISTENTE.");
        } else {
            pastos.add(pasto);
            System.out.println("\nPASTO ADICIONADO COM SUCESSO.");
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
            System.out.println("\nERROR: CURRAL COM ID JA EXISTENTE.");
        } else {
            currais.add(curral);
            System.out.println("\nCURRAL ADICIONADO COM SUCESSO.");
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
            System.out.println("\nERROR: CAMPEIRO COM ID JA EXISTENTE.");
        } else {
            campeiros.add(campeiro);
            System.out.println("\nCAMPEIRO ADICIONADO COM SUCESSO.");
        }
    }

    public void adicionarRemedio(Remedio remedio) {
        remedios.add(remedio);
        System.out.println("\nREMEDIO ADICIONADO COM SUCESSO.");
    }

    // -------------------------------------------------------------------------------------------
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
            System.out.println("\nANIMAL NÃO ENCONTRADO.");
            return;
        }

        for (Curral c : currais) {
            if (c.getId() == curralId) {
                c.adicionarAnimal(animalParaMover);

                animalParaMover.setLocalizacao("Curral " + curralId);
                System.out.println("\nANIMAL MOVIDO COM SUCESSO PARA O CURRAL " + curralId);

                curralEncontrado = true;
                break;
            }
        }

        if (!curralEncontrado) {
            System.out.println("\nCURRAL NÃO ENCONTRADO. ANIMAL SERÁ READICIONADO À LISTA PRINCIPAL.");
            animais.add(animalParaMover);
        }
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
            System.out.println("\nANIMAL NÃO ENCONTRADO.");
            return;
        }

        for (Pasto p : pastos) {
            if (p.getId() == pastoId) {
                p.adicionarAnimal(animalParaMover);
                pastoEncontrado = true;
                animalParaMover.setLocalizacao("PASTO " + pastoId);
                System.out.println("\nANIMAL MOVIDO COM SUCESSO PARA O PASTO " + pastoId);
                break;
            }
        }

        if (!pastoEncontrado) {
            System.out.println("\nPASTO NÃO ENCONTRADO. ANIMAL SERÁ READICIONADO À LISTA PRINCIPAL.");
            animais.add(animalParaMover);
        }
    }

    public void removerAnimalDoCurral(int animalId, int curralId) {
        Curral curralEncontrado = null;

        for (Curral c : currais) {
            if (c.getId() == curralId) {
                curralEncontrado = c;
                break;
            }
        }
        if (curralEncontrado == null) {
            System.out.println("\nCURRAL NÃO ENCONTRADO.");
            return;
        }

        Iterator<Animal> iterator = curralEncontrado.getAnimais().iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == animalId) {
                iterator.remove();
                a.setLocalizacao("\nFora de curral/pasto");
                System.out.println("\nANIMAL REMOVIDO DO CURRAL " + curralId);
                return;

            }
        }
        System.out.println("\nANIMAL NÃO ENCONTRADO NO CURRAL " + curralId);
    }

    public void removerAnimalDoPasto(int animalId, int pastoId) {
        Pasto pastoEncontrado = null;

        for (Pasto p : pastos) {
            if (p.getId() == pastoId) {
                pastoEncontrado = p;
                break;
            }
        }
        if (pastoEncontrado == null) {
            System.out.println("\nPASTO NÃO ENCONTRADO.");
            return;
        }

        Iterator<Animal> iterator = pastoEncontrado.getAnimais().iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == animalId) {
                iterator.remove();
                a.setLocalizacao("\nFora de curral/pasto");
                System.out.println("\nANIMAL REMOVIDO DO PASTO " + pastoId);
                return;

            }
        }
        System.out.println("\nANIMAL NÃO ENCONTRADO NO PASTO " + pastoId);
    }

    public void moverAnimalDoPastoParaCurral(int animalId, int pastoId, int curralId) {
        Pasto pastoEncontrado = null;
        Curral curralEncontrado = null;
        Animal animalEncotrado = null;

        for (Pasto p : pastos) {
            if (p.getId() == pastoId) {
                pastoEncontrado = p;
                break;
            }
        }

        if (pastoEncontrado == null) {
            System.out.println("\nPASTO NÃO ENCONTRADO.");
            return;
        }

        Iterator<Animal> iterator = pastoEncontrado.getAnimais().iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == animalId) {
                iterator.remove();
                animalEncotrado = a;
                break;
            }
        }

        if (animalEncotrado == null) {
            System.out.println("\nANIMAL NÃO ENCONTRADO NO PASTO " + pastoId);
            return;
        }

        for (Curral c : currais) {
            if (c.getId() == curralId) {
                curralEncontrado = c;
                break;
            }
        }

        if (curralEncontrado == null) {
            System.out.println("\nCURRAL NÃO ENCONTRADO. ANIMAL VOLTARÁ PARA O PASTO.");
            pastoEncontrado.adicionarAnimal(animalEncotrado);
            return;
        }

        curralEncontrado.adicionarAnimal(animalEncotrado);
        animalEncotrado.setLocalizacao("Curral " + curralId);
        System.out.println("\nANIMAL MOVIDO DO PASTO " + pastoId + " PARA O CURRAL " + curralId);

    }

    public void moverAnimalDoCurralParaPasto(int animalId, int curralId, int pastoId) {
        Pasto pastoEncontrado = null;
        Curral curralEncontrado = null;
        Animal animalEncotrado = null;

    
        for (Curral c : currais) {
            if (c.getId() == curralId) {
                curralEncontrado = c;
                break;
            }
        }

        if (curralEncontrado == null) {
            System.out.println("\nCURRAL NÃO ENCONTRADO.");
            return;
        }

        Iterator<Animal> iterator = curralEncontrado.getAnimais().iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.getId() == animalId) {
                iterator.remove();
                animalEncotrado = a;
                break;
            }
        }

        if (animalEncotrado == null) {
            System.out.println("\nANIMAL NÃO ENCONTRADO NO CURRAL " + curralId);
            return;
        }

        for (Pasto p : pastos) {
            if (p.getId() == pastoId) {
                pastoEncontrado = p;
                break;
            }
        }

        if (pastoEncontrado == null) {
            System.out.println("\nPASTO NÃO ENCONTRADO. ANIMAL VOLTARÁ PARA O CURRAL.");
            curralEncontrado.adicionarAnimal(animalEncotrado); 
            return;
        }

        
        pastoEncontrado.adicionarAnimal(animalEncotrado);
        animalEncotrado.setLocalizacao("Pasto " + pastoId);
        System.out.println("\nANIMAL MOVIDO DO CURRAL " + curralId + " PARA O PASTO " + pastoId);
    }

    // -------------------------------------------------------------------------------------------

    public void listarAnimais() {
        System.out.println("\nTODOS ANIMAIS NA FAZENDA:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public void estruturaFazenda() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("\tINFORMAÇOES COMPLETA SOBRE A FAZENDA");
        System.out.println("\nNOME: " + nome + "\nIDADE DA FAZENDA: " + idadeFazenda + donoFazenda);

        System.out.println("\n\tPASTOS");
        for (Pasto pasto : pastos) {
            System.out.println(pasto);
        }

        System.out.println("\n\tCURRAIS");
        for (Curral curral : currais) {
            System.out.println(curral);
        }

        System.out.println("\n\tCAMPEIROS");
        for (Campeiro campeiro : campeiros) {
            System.out.println(campeiro);
        }

        System.out.println("\n\tANIMAIS");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

        System.out.println("\n\tREMEDIOS");
        for (Remedio remedio : remedios) {
            System.out.println(remedio);
        }
    }

    @Override
    public String toString() {
        return "\nNOME: " + nome + "\nIDADE DA FAZENDA: " + idadeFazenda + "\nDONO: " + donoFazenda;
    }

}
