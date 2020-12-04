/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendedor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Departamento {

    //Atributos
    List<VendedorComissao> listaVendedores;

    //Construtor
    public Departamento() {
        this.listaVendedores = new ArrayList<>();
    }

    //Métodos
    public void adicionaVendedor(VendedorComissao vendedor) {
        listaVendedores.add(vendedor);
    }

    public Double calculaTotalSalario() {
        Double total = 0.0;
        for (VendedorComissao a : listaVendedores) {
            total += a.calculaSalario();
        }
        return total;
    }

    public void exibeTodos() {
        for (VendedorComissao a : listaVendedores) {
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Departamento{" + "listaVendedores=" + listaVendedores + '}';
    }

    

}
