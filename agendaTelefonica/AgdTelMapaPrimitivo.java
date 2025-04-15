import java.util.HashMap;
import java.util.Map;

public class AgdTelMapaPrimitivo {

    private Map<String, String> colecao = new HashMap<>();

    public AgdTelMapaPrimitivo(String nome, String numero) {
        this.colecao.put(nome, numero);
    }

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

    public void printar() {
        for (Map.Entry<String, String> contato : colecao.entrySet()) {
            System.out.println(contato.getKey() + " = " + contato.getValue());
        }
    }
}
