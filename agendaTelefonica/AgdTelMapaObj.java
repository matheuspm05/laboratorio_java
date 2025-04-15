
import java.util.HashMap;
import java.util.Map;

public class AgdTelMapaObj {

    private Map<String, Pessoa> mapa = new HashMap<>();

    public AgdTelMapaObj(String apelido, String nome, int numero) {
        Pessoa pessoa = new Pessoa(nome, numero);
        mapa.put(apelido, pessoa);
    }

    public void inserir(String apelido, Pessoa pessoa) {
        mapa.put(apelido, pessoa);
    }

    public Pessoa buscarPessoa(String apelido) {
        return mapa.get(apelido);
    }

    public void remover(String apelido) {
        mapa.remove(apelido);
    }

    public int tamanho() {
        return mapa.size();
    }

    public void printarObj() {
        for (Map.Entry<String, Pessoa> contato : mapa.entrySet()) {
            System.out.println(contato.getKey() + ": " + contato.getValue());
        }
    }
}
