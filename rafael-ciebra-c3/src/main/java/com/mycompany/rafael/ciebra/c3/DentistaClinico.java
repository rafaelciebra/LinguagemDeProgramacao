/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rafael.ciebra.c3;

/**
 *
 * @author rafae
 */
public class DentistaClinico {

    //Atributos
    private Integer codigo;
    private String nome;
    private Integer qtdConsulta;
    private Double valorConsulta;

    //Construtor
    public DentistaClinico(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    //Metodos
    public Double calcularSalario() {
        Double salario = this.qtdConsulta * this.valorConsulta;
        return salario;
    }

    @Override
    public String toString() {
        return "\nDentistaClinico{"
                + "\ncodigo=" + codigo
                + "\nnome=" + nome
                + "\nqtdConsulta=" + qtdConsulta
                + "\nvalorConsulta=" + valorConsulta
                + "\nsalario =" + calcularSalario()
                + '}';
    }

    public String getNome() {
        return nome;
    }

}
