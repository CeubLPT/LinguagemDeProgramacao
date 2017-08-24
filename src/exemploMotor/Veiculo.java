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
public class Veiculo {
    private String marca;
    private String modelo;
    private Motor motor;


    public Motor getMotor(){
        return motor;
    }
    
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;        
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    
}
