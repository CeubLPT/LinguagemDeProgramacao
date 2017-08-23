/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlematricula;

/**
 *
 * @author Alexandre.Torres
 */
public class Curso {
    private String nome;
    private int vagasDisponiveis = 30;
    private boolean ativo = false;
    
    public void inicia(){
        ativo = true;
    }
    
    public void encerra(){
        ativo = false;
    }
    
    public boolean matricula(){
        if (vagasDisponiveis > 0 && isAtivo()){
            vagasDisponiveis--;
            return true;
        }
        
        return false;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean isAtivo(){
        return ativo;
    }
    
    public String toString(){
        
        String texto;
        texto = "Curso: " + getNome() + "\n";
        texto += "Vagas disponíveis: " + vagasDisponiveis + "\n";
        if (isAtivo())
            texto += "curso em andamento";
        else
            texto += "curso encerrado";
        
        return texto;
                
        
    }
}
