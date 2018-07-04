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

public class AlunoPos extends Aluno implements Serializable {
    // Atributos
    private String area_de_pesquisa, orientador;
    
    // Construtor
    public AlunoPos(int m, String n, Calendar d, String adp, String o) {
        super(m,n,d);
        area_de_pesquisa = adp;
        orientador = o;
    }

    // Calculo do CRE
    public double calcCRE() {
        double t = 0; // t = somatorio notas
        for (Disciplina d:disciplinas_cursadas ) {
            t += d.getNota();
        }
        return (t / qtde_disciplinas);
    }
    
    // toString
    public String toString() {
        
        return super.toString() +  "\t�rea de Pesquisa: " + area_de_pesquisa;
    }
    
    // Boilerplate
    public String getAreaDePesquisa() {
        return area_de_pesquisa;
    }

    public void setAreaDePesquisa(String a) {
        area_de_pesquisa = a;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String o) {
        orientador = o;
    }
}
