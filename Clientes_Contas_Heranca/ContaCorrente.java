public class ContaCorrente extends Conta{
    
    public ContaCorrente(double saldo){
        super.saldo = saldo;
    }
    
    @Override
    public void Sacar(){
        if(valor < saldo){
            System.out.println("saldo insuficiente");
        }else{
            super.saldo = setSaldo(saldo - (valor + 5));
            System.out.println("saque concluido");
        }
    }
    
   
    @Override
    public void AplicarRendimentos(){
        setSaldo(super.saldo) = saldo + (1.2 * saldo);
    }
}
