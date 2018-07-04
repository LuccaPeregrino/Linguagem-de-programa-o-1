/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author aluno
 */
public class Filme {
    private String material;
    private List<String> categoria;
    private Producao datapro;
    private Lancamento datalan;
    private String sinopse;
    private String premio;
    private String genero;
    private LinkedList<Ator> atores = new LinkedList<Ator>();
    private Diretor diretor;
    private String nome;
    
    public Filme(String n, String m, Producao p, Lancamento l, String s, String pre, String g, Diretor d, List<String> c){
        material = m;
        datapro = p;
        datalan = l;
        sinopse = s;
        premio = pre;
        genero = g;
        diretor = d;
        nome = n;
        categoria = c;
    }
    
    public String getMaterial (){
        return material;
    }
    
    public void setMaterial(String m){
        material = m;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public Producao getDatapro (){
        return datapro;
    }
    
    public void setDatapro(Producao dp){
        datapro = dp;
    }
    
    public Lancamento getDatalan (){
        return datalan;
    }
    
    public void setDatalan(Lancamento dl){
        datalan = dl;
    }
    public String getSinopse (){
        return sinopse;
    }
    
    public void setSinopse(String s){
        sinopse = s;
    }
    
    public String getPremio (){
        return premio;
    }
    
    public void setPremio(String pre){
        premio = pre;
    }
    
    public String getGenero (){
        return genero;
    }
    
    public void setGenero(String g){
        genero = g;
    }
    
    public Diretor getDiretor(){
        return diretor;
    }
    
    public void setDiretor(Diretor d){
        diretor = d;
    }
    
    void adicCategoria(String c) {
        categoria.add(c);
    }
    
    public String getCategoria(int n) {
        return categoria.get(n-1);
    }
    
    void setAtores(Ator a) {
        atores.add(a);
    }
    
    public Ator getAtores(int n) {
        return atores.get(n-1);
    }
}
