/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.lr2;

import java.util.Random;

/**
 *
 * @author rafae
 */
public class Produto {

    private Integer codigo;
    private String nome;
    private Double preco;
    private String categoria;

    Random codigoAleatorio = new Random();

    public Produto(String nome, Double preco, String categoria) {
        this.codigo = codigoAleatorio.nextInt(1000);
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public Produto(Integer codigo, String nome, Double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    
    
    
}
