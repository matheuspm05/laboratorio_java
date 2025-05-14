import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Conta> contas;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = nome;
		contas = new ArrayList<>();

	}
    
	public void AddConta(Conta conta) {
		contas.add(conta);

	}


	public void MostrarSaldos() {
		 for (Contas c : contas) {
        System.out.println(c); 
    }
	}

	public String toString() {
		return "nome: " + nome + "CPF: " + cpf +"\n" + conta;
	}
}
