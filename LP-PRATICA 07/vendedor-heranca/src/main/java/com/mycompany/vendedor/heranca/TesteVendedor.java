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
public class TesteVendedor {

    public static void main(String[] args) {
        VendedorComissao v1 = new VendedorComissao(10, "João", 10000.0, 0.30);
        VendedorComissaoMaisFixo v2 = new VendedorComissaoMaisFixo(20, "Guilherme", 5500.0, 0.3, 2000.0);
        Departamento departamento = new Departamento();
        departamento.adicionaVendedor(v1);
        departamento.adicionaVendedor(v2);
        System.out.println("vendedores:");
        departamento.exibeTodos();
        System.out.println("Total em remuneração aos vendedores: ");
        System.out.println(departamento.calculaTotalSalario());
        
    }
}
