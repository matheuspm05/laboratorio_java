import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Participante p1 = new Participante("simo", "SIMO@GMAIL.COM");
        Participante p2 = new Participante("nigel", "nigel@GMAIL.COM");
        Participante p3 = new Participante("cratiel", "cratiel@GMAIL.COM");
        Participante p4 = new Participante("volpini", "volpini@GMAIL.COM");
        Participante p5 = new Participante("teste", "volpini@GMAIL.COM");
        Participante p6 = new Participante("miguel", "miguel@GMAIL.COM");
        Evento e1 = new Evento("churrasco");

        List<Participante> grupo = List.of(p1, p2, p3, p4);
        e1.adicionarTodas(grupo);

        e1.AddParticipantes(p5);
        e1.AddParticipantes(p6);
        

        //e1.removerParticipante("miguel@GMAIL.COM");


        e1.imprimirParticipantes();


    }
}
