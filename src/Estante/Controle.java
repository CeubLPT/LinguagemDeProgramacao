/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estante;

import java.util.Scanner;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
               
        Livro l = new Livro( "Harry Potter e o cálice de fogo",
                            38,
                            1400                            
                            );

        
        Estante e = new Estante();
        e.setNumero(1);
        e.adiciona(l);
        e.adiciona( new Livro("Misthburn", 2,600));
        e.adiciona( new Livro("Eramos seis", 20, 203));
        e.adiciona( new Livro("Escaravelho do diabo", 2,160));
        
        System.out.println( e );
        
        System.out.println("Qual livro você quer remover?");
        System.out.println("De 1 a " + e.getLivros().size());
        Scanner teclado = new Scanner(System.in);
        int indice = teclado.nextInt();
        
        e.retira(indice);
        
        System.out.println( e);
    }
}
