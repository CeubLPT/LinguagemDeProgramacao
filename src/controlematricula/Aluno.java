/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlematricula;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class Aluno {
    private String nome;
    private Curso curso;
    private int ra;
    private Date dataNascimento;
    private boolean ativo;
    
    public void matricular( String nome, int ra, Date dataNascimento){
        setNome(nome);
        this.ra = ra;
        setDataNascimento(dataNascimento);            
        ativo = true;
  
    }
    
    public void encerrarMatricula(){
        ativo = false; 
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public int getRa(){
        return ra;
    }
    
    public Curso getCurso(){
        return curso;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public boolean isAtivo(){
        return ativo;
    }
    
    @Override
    public String toString(){
        String texto;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String dataFormatada = formato.format(dataNascimento);
        
        texto = "Aluno: " + getNome() + "\n";
        texto += "RA: " + getRa() + "\n";
        texto += "Nascimento: " + dataFormatada + "\n";
        texto += curso + "\n";
        if (isAtivo())
            texto += "matrícula ativa \n";
        else
            texto += "matrícula inativa\n";
        
        return texto;
    }
}
