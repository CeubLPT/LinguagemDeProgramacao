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
public class Controle {
    public static void main(String[] args) {
        Cliente c = new Cliente( "Antonio da Silva", 526478963);        
        ContaCorrente cc = new ContaCorrente( 12345 );
        c.setContaCorrente( cc );
        
        c.getContaCorrente().lanca("C", "Depósito inicial", 1000);
        c.getContaCorrente().lanca("D", "Mc Donalds", 72.30);
        c.getContaCorrente().lanca("C", "Transferência", 53.20);
        c.getContaCorrente().lanca("D", "Faca dourada no CS", 1800);
        
        System.out.println( c.getContaCorrente() );

        
        
    }
}
