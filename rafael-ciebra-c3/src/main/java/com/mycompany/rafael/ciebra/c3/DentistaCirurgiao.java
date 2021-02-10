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
public class DentistaCirurgiao extends DentistaClinico {

    //Atributos
    private Integer qtdCirurgia;
    private Double valorCirurgia;

    //Construtor
    public DentistaCirurgiao(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta, Integer qtdCirurgia, Double valorCirurgia) {
        super(codigo, nome, qtdConsulta, valorConsulta);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
    }

    //Métodos 
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (this.qtdCirurgia * this.valorCirurgia);
    }

    @Override
    public String toString() {
        return "\nDentistaCirurgiao{"
                + "\n também é:" + super.toString()
                + "\nqtdCirurgia=" + qtdCirurgia
                + "\nvalorCirurgia=" + valorCirurgia
                + "\nsalario=" + calcularSalario()
                + '}';
    }

}
