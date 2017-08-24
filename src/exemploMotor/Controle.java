/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploMotor;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        Motor m = new Motor();
        m.setPotencia(.8);
        
        v.setMarca("Fiat");
        v.setModelo("147");
        v.setMotor( m );
        
        Motor k = v.getMotor();
        k.ligar();
        
        System.out.println( v.getMotor().isLigado() );
    }
}
