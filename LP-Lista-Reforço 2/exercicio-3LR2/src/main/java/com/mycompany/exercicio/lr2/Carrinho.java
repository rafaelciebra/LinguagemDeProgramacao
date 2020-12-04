/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.lr2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Carrinho {
    private Cliente cliente;
    private Boolean finalizado;
    private List<Produto> lista;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        this.finalizado = false;
        lista = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        if (!finalizado){
           lista.add(produto);
        }  
    }
   
    public void removerProduto(Produto produto){
        if(!finalizado){
            if(lista.contains(produto)){
                lista.remove(produto);
            }
        }
    }
    
    public void finalizarPedido(){
        this.finalizado=true;
        System.out.println("----NOTA FISCAL----");
        System.out.println("DADOS DO CLIENTE:");
        System.out.println("NOME: "+ cliente.getNome());
        System.out.println("CPF: "+ cliente.getCpf());
        System.out.println("\nPRODUTOS:");     
        for (Produto a: lista){           
        System.out.println("\nCOD: "+ a.getCodigo());
        System.out.println("ITEM: " + a.getNome());
        System.out.println(String.format("VALOR: R$%.2f ", a.getPreco()));
        System.out.println("CATEGORIA: " + a.getCategoria());       
    }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Carrinho{" + "cliente=" + cliente + ", finalizado=" + finalizado + ", lista=" + lista + '}';
    }
    
}
