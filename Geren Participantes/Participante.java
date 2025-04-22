public class Participante {
    
    private String nomeParticipante;
    private String email;


    public Participante(String nome, String email) {
        this.nomeParticipante = nome;
        this.email = email;

    }

    public String getNome() {
        return nomeParticipante;
    }

    public String getEmail() {
        return email;
    }

    @Override

    public String toString() {
        
        return "\nNome Participante: " + nomeParticipante  + "\nEmail: " + email;
    }
}
