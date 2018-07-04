/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Producao {
    private int ano;
    private String cidade;
    private String pais;
    private String estado;
    
    public Producao(int a, String c, String p, String e){
        ano = a;
        cidade = c;
        pais = p;
        estado = e;
    }
    
    public int getAno (){
        return ano;
    }
    
    public void setAno(int a){
        ano = a;
    }
    
    public String getCidade (){
        return cidade;
    }
    
    public void setCidade(String c){
        cidade = c;
    }
    
    public String getPais (){
        return pais;
    }
    
    public void setPais(String p){
        pais = p;
    }
    
    public String getEstado (){
        return estado;
    }
    
    public void setEstado(String e){
        estado = e;
    }
}
