public class Cliente{
    String nome;
    String sobrenome;
    String cpf;
    Cliente conjuge;
    
    public void casar(Cliente conjuge) {
        if (this.conjuge != null) {
            this.conjuge = conjuge;
            this.conjuge.conjuge = this;
        } else {
            System.out.println("ja casado");
        }
        
    }
}
