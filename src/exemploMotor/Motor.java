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
public class Motor {
    private double potencia;    
    private boolean ligado = false;
    
    public boolean ligar(){
        
        if (isLigado())
            return false;
        
        ligado = true;
        return true;        
    }
    
    public boolean desligar(){
        if (isLigado()){
            ligado = false;
            return true;
        }
        
        return false;
    }
    
    public boolean isLigado(){
        return ligado;
    }
    
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
    public double getPotencia(){
        return potencia;
    }
    
}
