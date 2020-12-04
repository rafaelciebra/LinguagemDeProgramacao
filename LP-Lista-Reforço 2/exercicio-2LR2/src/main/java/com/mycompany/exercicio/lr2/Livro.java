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
public class Livro {
    private Integer codigo;
    private String nome;
    private String autor;
    private String categoria;
    
    
    public Livro( String nome, String autor, String categoria) {       
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;     
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", categoria=" + categoria + '}';
    }
    
    
    
}
