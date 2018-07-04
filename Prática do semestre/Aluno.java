/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projalunoprat4;

/**
 *
 * @author CI
 */
import java.util.*;
import java.text.*;
import java.io.Serializable;

public abstract class Aluno implements Serializable {
    // Atributos
    protected int matricula, qtde_disciplinas;
    protected String nome;
    protected Calendar data_nascimento;
    protected LinkedList<Disciplina> disciplinas_cursadas = new LinkedList<Disciplina>();
   
    
    // Construtor
    public Aluno(int m, String n, Calendar d) {
        matricula = m;
        nome = n;
        data_nascimento = d;
        qtde_disciplinas = 0;
    }
    
    // Metodos para adicionar uma disciplina
    public void  setDisciplinasCursada(Disciplina d) {
            disciplinas_cursadas.add(d);
    }
        
    
    public Disciplina getDisciplinasCursada(int n) {
       
            return disciplinas_cursadas.get(n - 1);

    }
    
    // M�todo abstrato
    public abstract double calcCRE();
    
    // toString
    public String toString(){
        DecimalFormat dd = new DecimalFormat("0.00");
        return "Matricula: " + matricula + "\nNome: " + nome +  "\nData de Nascimento: " +  data_nascimento.get(Calendar.DAY_OF_MONTH) + " / " +  (data_nascimento.get(Calendar.MONTH) + 1) + " / " + data_nascimento.get(Calendar.YEAR) + "\nCRE: " + dd.format(calcCRE()); 
    }
    
    // Boilerplate
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        matricula = m;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public Calendar getDataDeNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(Calendar d) {
        data_nascimento = d;
    }
}
