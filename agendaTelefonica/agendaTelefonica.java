import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

    private Map<String, String> colecao = new HashMap<String, String>();;


    public void inserir(String nome, String numero) {
        colecao.put(nome, numero);
    }

    public String buscarNumero(String nome) {
        
        return colecao.get(nome);
    }

    public void remover(String nome) {
        colecao.remove(nome);
    }

    public int tamanho() {
        return colecao.size();
    }

    //public void printar() {
        // intereitor
    //}
}
