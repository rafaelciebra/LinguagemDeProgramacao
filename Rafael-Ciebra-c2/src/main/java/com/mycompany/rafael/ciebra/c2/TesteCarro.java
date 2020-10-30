/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rafael.ciebra.c2;

/**
 *
 * @author Aluno
 */
public class TesteCarro {
    public static void main(String[] args) {       
        //objetos
        Carro a = new Carro();
        Carro b = new Carro();
        Locadora locadora = new Locadora();
        //configuração de valores objeto (a)
        a.setIdCarro(1010);
        a.setModelo("HB20");
        a.setPlaca(123456);
        a.setEstaAlugado(true);
        a.setEstaEmConcerto(false);
        a.setValorAluguelDia(50.0);
        a.setQtdDias(15);
        //configuração de valores objeto (b)
        b.setIdCarro(1020);
        b.setModelo("Fiat Toro");
        b.setPlaca(654321);
        b.setEstaAlugado(true);
        b.setEstaEmConcerto(true);
        b.setValorAluguelDia(70.0);
        //invocando o metodo registraAluguel() para o primeiro objeto carro
        System.out.println("Situação carro de id: " + a.getIdCarro() + ", modelo " + a.getModelo() );
        locadora.registraAluguel(a, a, a, a);
        //invocando o metodo registraManutencao() para o segundo objeto carro
        System.out.println("Situação carro de id: " + b.getIdCarro() + ", modelo " + b.getModelo() );
        locadora.registraManutencao(b);
        //Invocando o método exibeInfoCarro() para os dois carros
        locadora.exibeInfoCarro(a);
        locadora.exibeInfoCarro(b);
        //Invocando o método registraDevolucao() para o primeiro objeto carro.
        locadora.registraDevolucao(a);
        //Invocando o método exibeInfoCarro() para o primeiro objeto carro.
        locadora.exibeInfoCarro(a);
        //Invocando o método exibirRelatorio()
        locadora.exibirRelatorio();


    
    }
}
