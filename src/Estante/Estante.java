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
public class Estante {
    private int numero;
    private Livro[] livros = new Livro[10];
    private int ultimaPosicao = 0;
    
    public void adiciona(Livro l){
       livros[ ultimaPosicao++ ] = l;
       
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    
    public String toString(){
        String texto = "Estante: " + getNumero()+"\n";
        
        for (Livro l:livros)
            if (l != null)
                texto += l.getTitulo() + "\n";
        
        return texto;
    }

}
