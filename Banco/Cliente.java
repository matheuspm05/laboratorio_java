public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    Cliente conjuge;

    public void casar(Cliente conjuge) {
        if (this.conjuge == null && conjuge.conjuge == null) {
            this.conjuge = conjuge;
            this.conjuge.conjuge = this;
            
            System.out.printf( "\n" + this.nome + " CASOU COM " + conjuge.nome + "\n");

        } else {
            System.out.println("JA ESTÁ CASADO");
        }
    }

    public void mostraConjuge() {
        if (this.conjuge != null) {
            System.out.println("VOCÊ ESTÁ CASADO COM: " + this.conjuge.nome + " " + this.conjuge.sobrenome);
        } else {
            System.out.println("VOCÊ AINDA NÃO ESTÁ CASADO.");
        }
    }
}
