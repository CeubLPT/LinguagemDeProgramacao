/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Alexandre.Torres
 */
public class Movimentacao {
    private String tipo;
    private String descricao;
    private double valor;
    
    public Movimentacao(String tipo, String desc, double valor){
        this.tipo = tipo;
        descricao = desc;
        this.valor = valor;
    }
    
    public String toString(){
        return tipo + "\t" + descricao + "\tR$ " + valor + "\n";
    }
}
