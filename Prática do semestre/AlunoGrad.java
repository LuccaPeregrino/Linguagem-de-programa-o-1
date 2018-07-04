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
import java.io.Serializable;

public class AlunoGrad extends Aluno implements Serializable {
    private int periodos_trancados;
    private String periodo_ingresso;
    
    // Construtor
    public AlunoGrad(int m, String n, Calendar d, String p) {
        super(m, n, d);
        periodos_trancados = 0;
        periodo_ingresso = p;
    }
    
    // toString
    public String toString() {
        return super.toString() + "\tPeríodos Trancados: " + periodos_trancados;
    }
    
    // Trancar per�odos
    public void setPeriodosTrancados() {
        this.periodos_trancados++;
    }
    
    // Calculo do CRE
    public double calcCRE() {
        double t = 0, tt = 0; // t = somatorio das notas, tt = somatorio da carga horaria
        for (Disciplina d: disciplinas_cursadas)
       {
            t += d.getNota()*d.getCarga_horaria();
            tt += d.getCarga_horaria();
        }
        
        return t/tt;
    }
    
    // Boilerplate
    public String getPeriodoDeIngresso() {
        return periodo_ingresso;
    }

    public void setPeriodoDeIngresso(String p) {
        periodo_ingresso = p;
    }
}
