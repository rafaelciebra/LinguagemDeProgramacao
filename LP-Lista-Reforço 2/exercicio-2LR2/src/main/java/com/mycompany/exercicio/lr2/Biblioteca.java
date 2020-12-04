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
public class Biblioteca {
    private String nome;
    private Integer qtdLivros;
    private List<Livro> lista;
    
    public Biblioteca(String nome) {
        this.nome = nome;
        lista = new ArrayList<Livro>();
        this.qtdLivros = 0;
    }
    
    public void cadastrarLivro(Livro livro){
        //++qtdLivros;
        livro.setCodigo(++qtdLivros);
        lista.add(livro);       
    }
    public void exibirLivros(){
        System.out.println("Lista de livros:");
        for (Livro a: lista){       
                      System.out.println(a);
               }
    }
    public void exibirLivrosporAutor(String autor){
        System.out.println("Livros por autor:");
        for (Livro a: lista){       
                 if(a.getAutor().equals(autor)){
                     System.out.println(a);
                 }     
        }
    }
    public void exibirPorCategoria(String categoria){
        System.out.println("Livros por categoria:");
        for(Livro b: lista){
            if(b.getCategoria().equals(categoria)){
                System.out.println(b);
            }
        }
    }
    
   
    
}
