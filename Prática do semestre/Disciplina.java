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
import java.text.*;
import java.io.Serializable;

public class Disciplina implements Serializable {
    // Atributos
    private String nome, periodo_cursado;
    private int codigo, carga_horaria;
    private double nota;
    
    // Construtor
    public Disciplina(int co, String n, String p, int ca, double no) {
        codigo = co;
        nome = n;
        periodo_cursado = p;
        carga_horaria = ca;
        nota = no;
    }
    
    // toString
    public String toString() {
        DecimalFormat dd = new DecimalFormat();
        return "Disciplina: " + nome + "\tPer�odo: " + periodo_cursado + "\tNota: " + dd.format(nota);
    }
    
    // Boilerplate
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCargaHoraria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodoCursado() {
        return periodo_cursado;
    }

    public void setPeriodoCursado(String periodo_cursado) {
        this.periodo_cursado = periodo_cursado;
    }
    
}
