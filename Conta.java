public class Conta {

    int numero;
    double limite = 500;
    double saldo;
    Cliente titular;

    Conta() {
        this.titular = new Cliente();
        limite = 500;
        saldo = 1000;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("SAQUE DE R$" + valor + " REALIZADO COM SUCESSO.");
        } else if (valor <= saldo + limite) {
            double restante = valor - saldo;
            saldo = 0;
            limite -= restante;
            System.out.println("SAQUE DE R$" + valor + " REALIZADO COM SUCESSO USANDO O LIMITE.");
        } else {
            System.out.println("ERRO: SALDO INSUFICIENTE! VOCÊ TEM APENAS R$" + saldo);
        }
    }

    public void valorLim() {
        System.out.println("VALOR LIMITE: " + limite);
    }

    public void depositar(double valor) {
        if (valor >= 0) {
        saldo += valor;
        System.out.println("DEPÓSITO DE R$" + valor + " REALIZADO COM SUCESSO.");
        }else {
            System.out.println("VALOR INVALIDO");
        }
       
    }

}
