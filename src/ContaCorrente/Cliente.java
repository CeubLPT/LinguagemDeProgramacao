/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Alexandre.Torres
 */
public class Cliente {
    private String nome;
    private int cpf;
    private ContaCorrente contaCorrente;
    
    public Cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCpf(){
        return cpf;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    
}
