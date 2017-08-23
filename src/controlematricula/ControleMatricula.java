/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlematricula;

import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class ControleMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Curso curso = new Curso();
        curso.setNome("Análise de Sistemas");
        curso.inicia();
        
        Aluno aluno = new Aluno();
        aluno.matricular("Zé da Silva", 232425, new Date(90, 6,22) );
        aluno.setCurso(curso);
        
        System.out.println( aluno );
    }
        
    
}
