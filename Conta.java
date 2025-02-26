public class Conta {

    int numero;
    String nome;
    double limite;
    double saldo = 1000;

    void sacar(double v) {
        if (saldo >= v) {
            saldo -= v;
            System.out.println("SAQUE DE R$" + v + " REALIZADO COM SUCESSO.");
        } else {
            System.out.println("ERRO: SALDO INSUFICIENTE! VOCÊ TEM APENAS R$" + saldo);
        }
    }

    void depositar(double v) {
        saldo += v;
        System.out.println("DEPÓSITO DE R$" + v + " REALIZADO COM SUCESSO.");
    }
}
