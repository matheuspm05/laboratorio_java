import java.util.List;
import java.util.ArrayList;


public class AgdTelListaPrimitiva {

    List<String> lista = new ArrayList<>();

    public AgdTelListaPrimitiva(String nome_num) {
        lista.add(nome_num);
    }

    public void inserir(String nome_num) {
        lista.add(nome_num);
    }

    public String buscarPessoa(String nome) {
        for (String contato : lista) {
            if (contato.startsWith(nome + ":")) {
                return contato;
            }
        }
        return "nao encontrado";
    }

    public void remover(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).startsWith(nome + ":")) {
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
