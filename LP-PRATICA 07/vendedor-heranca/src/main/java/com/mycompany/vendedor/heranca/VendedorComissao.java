/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendedor.heranca;

/**
 *
 * @author rafae
 */
public class VendedorComissao {

    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    //Construtor
    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Double calculaSalario() {
        Double ganhoNoMes = this.taxa * this.vendas;
        return ganhoNoMes;
    }

    //toString
    @Override
    public String toString() {
        return "VendedorComissao{"
                + "\ncodigo= " + codigo
                + "\nnome= " + nome
                + "\nvendas= " + vendas
                + "\ntaxa= " + taxa
                + "\nsalario= " + calculaSalario()
                + '}';
    }

}
