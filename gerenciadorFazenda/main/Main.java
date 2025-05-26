package main;

import main.classes.Animal;
import main.classes.Boi;
import main.classes.Campeiro;
import main.classes.Cavalo;
import main.classes.DonoFazenda;
import main.classes.Fazenda;
import main.classes.Pasto;
import main.classes.Remedio;
import main.classes.Vaca;
import main.classes.Curral;

public class Main {
    public static void main(String[] args) {
        DonoFazenda dono1 = new DonoFazenda("matheus pastore", "22222.22", "(28)999.999", 10.000);

        Fazenda fazenda1 = new Fazenda("fazenda Pastore", "2 anos", dono1);

        Animal boi1 = new Boi(1, "gabriel", "3 anos", "380kg", "Nelore");
        Animal boi2 = new Boi(2, "daniel", "2 anos", "400kg", "Angus");
        Animal boi3 = new Boi(1, "gabriel", "3 anos", "380kg", "Nelore");

        Animal vaca1 = new Vaca(3, "Mimosa", "2 anos", "390kg", "15L");
        Animal vaca2 = new Vaca(4, "Giovanna", "1 anos", "420kg", "18L");

        Animal cavalo1 = new Cavalo(5, "Relâmpago", "4 anos", "450kg", "Marrom");
        Animal cavalo2 = new Cavalo(6, "Jonas", "6 anos", "435kg", "Branco");

        Pasto pasto1 = new Pasto(1, "500m²", "Capim-tanzânia");
        Pasto pasto2 = new Pasto(2, "700m²", "Braquiária");

        Curral curral1 = new Curral(1, 10);
        Curral curral2 = new Curral(2, 15);

        Campeiro campeiro1 = new Campeiro(30, "Miguel", "2 anos", 2500.00);
        Campeiro campeiro2 = new Campeiro(31, "Luis Guilherme", "1 anos", 3000.00);

        Remedio remedio1 = new Remedio("Ivermectina", "10ml");
        Remedio remedio2 = new Remedio("Vitamax", "5ml");

        // add animais
        fazenda1.adicionarAnimal(boi1);
        fazenda1.adicionarAnimal(boi2);
        fazenda1.adicionarAnimal(vaca1);
        fazenda1.adicionarAnimal(vaca2);
        fazenda1.adicionarAnimal(cavalo1);
        fazenda1.adicionarAnimal(cavalo2);

        // add pastos
        fazenda1.adicionarPasto(pasto1);
        fazenda1.adicionarPasto(pasto2);

        // add currais
        fazenda1.adicionarCurral(curral1);
        fazenda1.adicionarCurral(curral2);

        // add campeiros
        fazenda1.adicionarCampeiro(campeiro1);
        fazenda1.adicionarCampeiro(campeiro2);

        // add remedios
        fazenda1.adicionarRemedio(remedio1);
        fazenda1.adicionarRemedio(remedio2);

        System.out.println("\n--- LISTAR ANIMAIS NA FAZENDA ---");
        fazenda1.listarAnimais();

        fazenda1.adicionarAnimal(boi3);

        fazenda1.moverAnimalParaPasto(1, 1);
        fazenda1.moverAnimalParaPasto(2, 1);

        pasto1.listarAnimais();

        fazenda1.moverAnimalDoPastoParaCurral(1, 1, 1);
        fazenda1.removerAnimalDoPasto(2, 1);

        pasto1.listarAnimais();
        curral1.listarAnimais();

        pasto1.limpar();

        fazenda1.moverAnimalParaPasto(2, 2);
        fazenda1.moverAnimalParaPasto(3, 2);
        fazenda1.moverAnimalParaPasto(4, 2);
        fazenda1.moverAnimalParaPasto(5, 2);
        fazenda1.moverAnimalParaPasto(6, 2);

        pasto2.listarAnimais();

        boi1.aplicarRemedio(remedio1);

        

    }
}
