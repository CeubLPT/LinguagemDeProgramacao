/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    private ArrayList<Movimentacao> lancamentos;

    // Construtor que recebe o numero 
    // e faz o saldo = 0
    public ContaCorrente(int numero){
        this.numero = numero;
        saldo = 0;
        lancamentos = new ArrayList<>();
    }
    
    public void lanca(String tipo, String descricao, double valor){
        Movimentacao m = new Movimentacao(tipo, descricao, valor);        
        lancamentos.add(m); 
        
        if (tipo.equalsIgnoreCase("D"))
            saldo -= valor;
        else
            saldo += valor;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String toString(){
        String txt = "Conta: " + numero + "\n";
        txt += "Saldo: " + saldo + "\n";
        txt += "\nExtrado\n----------------\n";
        for (Movimentacao m : lancamentos){
            txt += m;
        }
        
        return txt;
    }
    
    
}
