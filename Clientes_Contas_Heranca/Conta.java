public class Conta{
    private double saldo = 0;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void CriarConta(double saldo, char tipo) {
		
	}
	
    public void Sacar(double valor){
        if(valor < saldo){
            System.out.println("saldo insuficiente");
        }else{
            this.saldo = saldo - valor;
            System.out.println("saque concluido");
        }
    }
    
    public void Depositar(double valor){
        if(valor < 0){
            System.out.println("valor negativo");
        }else{
            this.saldo = saldo + valor;
            System.out.println("deposito concluido");
        }
       
        
    }
    public void AplicarRendimentos(){
        this.saldo = saldo + (0.2 * saldo);
        
    }
    
    @Override
    
    public String toString(){
        return "saldo: " + saldo;
    }
    
    
    
} 
