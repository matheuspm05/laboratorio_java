import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Evento {

    private Set<Participante> participantes;
    private String nomeEvento;

    public Evento(String nome) {
        this.nomeEvento = nome;

        participantes = new HashSet<>();

    }

    public String getNome() {
        return nomeEvento;
    }

    public void AddParticipantes(Participante participante) {
        this.participantes.add(participante);
        verificarParticipante(participante.getEmail());
    }

    public void adicionarTodas(List<Participante> novosParticipantes) {
        participantes.addAll(novosParticipantes);
    }

    private void verificarParticipante(String email) {
        for (Participante ptc : participantes) {
            if (ptc.getEmail().equals(email)) {
                System.out.println("JA EXISTE O PARTICIPANTE");
                break;
            }
        }
    }

    public void removerParticipante(String email) {
        for (Participante ptc : participantes) {
            if (ptc.getEmail().equals(email)) {
                participantes.remove(ptc);
                System.out.println(ptc.getNome() + " REMOVIDO COM SUCESSO!");
            }
        }
    }

    public void imprimirParticipantes() {
        for (Participante ptc : participantes) {
            if (ptc != null) {
                 System.out.println(ptc);
            }
           
        }

    }

}
