
import java.util.HashMap;
import java.util.Map;

public class AgdTelefonicaObj {

    private Map<String, Pessoa> colecaoObj = new HashMap<>();;


    public void inserir(String apelido, Pessoa p) {
        colecaoObj.put(apelido, p);
    }

    public Pessoa buscarPessoa(String apelido) {
        
        return colecaoObj.get(apelido);
    }

    public void remover(String apelido) {
        colecaoObj.remove(apelido);
    }

    public int tamanho() {
        return colecaoObj.size();
    }

    public void printarObj() {
        for (Map.Entry<String, Pessoa> contato : colecaoObj.entrySet()) {
            System.out.println(contato.getKey() + " = " + contato.getValue());
        }
    }
}
