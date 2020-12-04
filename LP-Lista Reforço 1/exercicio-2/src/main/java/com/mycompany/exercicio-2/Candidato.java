/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio;

/**
 *
 * @author rafae
 */
public class Candidato {
    private Integer idCandidato;
    private String nome;
    private String cursoDesejado;
    private Double notaProva;
    private Double notaDinamica;
    private Boolean fezProva;
    private Boolean aprovado;

    public Double calcularMedia(){
         Double media = notaProva *0.4 + notaDinamica * 0.6;
         return media;
    }
    //construtor
    public Candidato(Integer idCandidato, String nome, String cursoDesejado) {
        this.idCandidato = idCandidato;
        this.nome = nome;
        this.cursoDesejado = cursoDesejado;
        this.notaProva = 0.0;
        this.notaDinamica = 0.0;
        this.fezProva = false;
        this.aprovado = false;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public String getNome() {
        return nome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public Double getNotaDinamica() {
        return notaDinamica;
    }

    public Boolean getFezProva() {
        return fezProva;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setFezProva(Boolean fezProva) {
        this.fezProva = fezProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setNotaDinamica(Double notaDinamica) {
        this.notaDinamica = notaDinamica;
    }

    @Override
    public String toString() {
        return "Candidato{" + "idCandidato=" + idCandidato + ", nome=" + nome + ", cursoDesejado=" + cursoDesejado + ", notaProva=" + notaProva + ", notaDinamica=" + notaDinamica + ", fezProva=" + fezProva + ", aprovado=" + aprovado + '}';
    }
    
}
