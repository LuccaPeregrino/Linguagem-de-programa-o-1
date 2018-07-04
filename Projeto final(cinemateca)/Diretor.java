/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Diretor {
    private String nome;
    private int registro;
    
    public Diretor(String n, int r){
        nome = n;
        registro = r;
    }
    
     public int getRegistro (){
        return registro;
    }
    
    public void setRegistro(int r){
        registro = r;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
}
