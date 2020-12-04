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
public class VendedorComissaoMaisFixo extends VendedorComissao {

    //Atributos
    private Double salarioFixo;
    //Construtor

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    //Método Sobrescrevido calculaSalario()
    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + salarioFixo;
    }

    //ToString Sobrescrevido
    @Override
    public String toString() {
        return  "\nVendedorComissaoMaisFixo{"
                + "\n" + super.toString()
                + "\nsalarioFixo= " + salarioFixo
                + "}";
    }
    

}
