/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estante;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
               
        Livro l = new Livro();
        l.setTitulo("Harry Potter e o cálice de fogo");
        l.setPaginas(1400);
        l.setEdicao(38);

        Livro l1 = new Livro();
        l1.setTitulo("Harry Potter e prisioneiro de Azkaban");
        l1.setPaginas(1400);
        l1.setEdicao(38);
        
        Livro l2 = new Livro();
        l2.setTitulo("Harry Potter e a pedra filosofal");
        l2.setPaginas(1400);
        l2.setEdicao(38);
        
        Estante e = new Estante();
        e.setNumero(1);
        e.adiciona(l);
        e.adiciona(l1);
        e.adiciona(l2);
        
        System.out.println( e );
        
        
    }
}
