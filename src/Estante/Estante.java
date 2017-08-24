/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estante;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class Estante {
    private int numero;
    private ArrayList<Livro> livros = new ArrayList<>();
    private int ultimaPosicao = 0;
    
    public void adiciona(Livro l){
       livros.add( l );       
    }
    
    public void retira( Livro l){
        livros.remove(l);
    }

    public void retira( int indice ){
        livros.remove(indice-1);
    }    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList getLivros() {
        return livros;
    }

    public void setLivros(ArrayList livros) {
        this.livros = livros;
    }
    
    @Override
    public String toString(){
        String texto = "Estante: " + getNumero()+"\n";
        int cont = 0;
        for (Livro l:livros)
            if (l != null)
                texto += ++cont + ") " + l + "\n";
        
        return texto;
    }

}
