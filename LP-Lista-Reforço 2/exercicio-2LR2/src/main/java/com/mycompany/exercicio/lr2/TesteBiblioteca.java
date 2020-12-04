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
public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote","Miguel de Cervantes","Romance");
        Livro livro2 = new Livro("O Senhor dos Anéis","John Ronald Reuel Tolkien","Fantásia");
        Livro livro3 = new Livro("O Código Da Vinci ","Dan Brown","Mistério");
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        
        //cadastrando os livros:
        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);
        //exibindo livros cadastrados:
        biblioteca.exibirLivros();
        //exibindo livros por autor:
        biblioteca.exibirLivrosporAutor("Miguel de Cervantes");
        //exibindo livros por categoria:
        biblioteca.exibirPorCategoria("Mistério");
        
       

    }
}
