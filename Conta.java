public class Conta {

    int numero;
    double limite = 500;
    double saldo = 1000;
    Cliente titular;
    
   public void sacar(double v) {
        if (saldo >= v) {
            saldo -= v;
            System.out.println("SAQUE DE R$" + v + " REALIZADO COM SUCESSO.");
        } else {
            System.out.println("ERRO: SALDO INSUFICIENTE! VOCÊ TEM APENAS R$" + saldo);
        }
    }

    public void depositar(double v) {
        saldo += v;
        System.out.println("DEPÓSITO DE R$" + v + " REALIZADO COM SUCESSO.");
    }
   
}
