/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nascimento;

/**
 *
 * @author Alexandre.Torres
 */
public class Pessoa {
    private String nome;
    private int idade;
    private boolean viva;
    
    public Pessoa(String nome){
        this.nome = nome;
        viva = true;
        idade = 0;
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        viva = true;
        this.idade = idade;
        
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    } 
}
