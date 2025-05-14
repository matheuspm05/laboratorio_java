public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(double saldo){
        super.saldo = saldo;
    }
    
    @Override
    public void Sacar(){
        if(valor < saldo){
            System.out.println("saldo insuficiente");
        }else{
            super.saldo = setSaldo(saldo - (valor + 15));
            System.out.println("saque concluido");
        }
    }
    
    @Override
    public void AplicarRendimentos(){
        super.saldo = setSaldo(saldo + (0.5 * saldo));
    }
}
