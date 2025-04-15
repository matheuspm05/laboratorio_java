import java.util.ArrayList;
import java.util.List;

public class AgdTelListaObj {
    List<Pessoa> lista = new ArrayList<>();

    public AgdTelListaObj(String nome, int numero) {
        Pessoa pessoa = new Pessoa(nome, numero);
        lista.add(pessoa);
    }

    public void inserir(String nome, int numero) {
        Pessoa pessoa = new Pessoa(nome, numero);
        lista.add(pessoa);
    }

    public String buscarPessoa(String nome) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getNome().equals(nome)) {
                return nome + " = numero: " + pessoa.getnumero();
            }
        }
        return "nao encontrado";
    }

    public void remover(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                lista.remove(i);
                break; 
            }
        }
    }
    
    public int tamanho() {
        return lista.size();
    }

    public void printar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("indice: " + i + ": " + lista.get(i));
        }
    }

}
