
package com.mycompany.aula25_02_25;

/**
 *
 * @author alunolab08
 */
public class Conta {
    
    int numero;
    String nome;
    double limite;
    double saldo;
    
    void sacar(double v){
        saldo -= v;
        
    }
    
    void depositar(double v){
        saldo += v;
        
    }
    
}
