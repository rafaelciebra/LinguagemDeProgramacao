/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor.heranca;

/**
 *
 * @author rafae
 */
public class Professor {

    protected String nome;
    protected Integer codigo;
    protected Integer qtdHoras;
    protected Double valorHora;

    //Construtor
    public Professor(String nome, Integer codigo,Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    //Métodos
    public Double calculaSalario() {
        Double salarioProfessor = (this.qtdHoras * this.valorHora) * 4.5;
        return salarioProfessor;
    }

    //toString
    @Override
    public String toString() {
        return "Professor{"
                + "\nnome=" + nome
                + "\ncodigo=" + codigo
                + "\nqtdHoras=" + qtdHoras
                + "\nvalorHora=" + valorHora
                + "\nsalario Professor=" + calculaSalario()
                + '}';
    }
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    

}
