/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.lr2;

/**
 *
 * @author rafae
 */
public class TesteCarrinho {
    public static void main(String[] args) {
        
    
    Produto produto1 = new Produto("Ps5",5400.00,"Eletrônicos");
    Produto produto2 = new Produto("Bolacha",5.50,"Alimentos");
    Produto produto3 = new Produto("Notebook Lenovo",2200.00,"Eletrônicos");
    
    Cliente cliente1 = new Cliente("Maria","5187953184-44");
    Carrinho carrinho1 = new Carrinho(cliente1);
    
    carrinho1.adicionarProduto(produto3);
    carrinho1.adicionarProduto(produto2);
    carrinho1.adicionarProduto(produto1);
   
    carrinho1.finalizarPedido();
    
    }
}
