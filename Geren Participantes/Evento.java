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
        if(verificarParticipante(participante.getEmail()) == true){
            participantes.add(participante);
        }
    }

    public void adicionarTodas(List<Participante> novosParticipantes) {
        if(verificarParticipante(List<Participante>.getEmail()) == true){
            participantes.addAll(List<Participante>);
        }
    }

    private boolean verificarParticipante(String email) {
        for (Participante ptc : participantes) {
            if (ptc.getEmail().equals(email)) {
                System.out.println("JA EXISTE O PARTICIPANTE");
                return false;
            }
        }
        return true;
    }

    public void removerParticipante(String email) {
        
        Iterator<Participante> iterator = participantes.iterator();
        
        while (iterator.hasNext()) {
            Participante ptc = iterator.next();
            if (ptc.getEmail().equals(email)) {
                iterator.remove();  
                System.out.println(ptc.getNome() + " REMOVIDO COM SUCESSO!");
                break; 
            }
        }
        System.out.println("Participante com o email " + email + " não encontrado.");
    }

    public void imprimirParticipantes() {
        for (Participante ptc : participantes) {
            if (ptc != null) {
                 System.out.println(ptc);
            }
           
        }

    }

}
