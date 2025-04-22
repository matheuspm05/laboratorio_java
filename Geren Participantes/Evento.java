import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

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
		if(verificarParticipante(participante.getEmail()) == true) {
			participantes.add(participante);
		}
	}

    public void adicionarTodas(List<Participante> novosParticipantes) {
        for (Participante participante : novosParticipantes) {
            if (verificarParticipante(participante.getEmail())) {
                participantes.add(participante);
            }
        }
    }

	private boolean verificarParticipante(String email) {
		for (Participante ptc : participantes) {
			if (ptc.getEmail().equals(email)) {
				System.out.println("JA EXISTE O PARTICIPANTE\n");
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
				return;
			}
		}
		System.out.println("Participante com o email " + email + " nao encontrado.");
	}

	public void imprimirParticipantes() {
		for (Participante ptc : participantes) {
			System.out.println(ptc);
		}

	}

}
