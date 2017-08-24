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
public class Controle {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Maria");
        
        Pessoa velha = new Pessoa("Tiburso", 78);
        
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Nome: " + p.getNome());
    }
    
}
