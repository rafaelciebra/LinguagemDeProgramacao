/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosdereforcopoo;

/**
 *
 * @author rafae
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado Joao = new Empregado();
        System.out.println("------------------------------------------------------------------------------------------------------");
        Joao.setSalario(5.400);
        Joao.setNome("Joao Da Silva");
        Joao.setCargo("Analista de Sistemas");
        System.out.println(String.format("Nome do Empregado: %s", Joao.getNome()));
        System.out.println(String.format("Cargo: %s", Joao.getCargo()));
        System.out.println(String.format("Salario antes do reajuste: R$ %.3f", Joao.getSalario()));
        System.out.println(String.format("Salario depois do reajuste: R$ %.3f", Joao.reajustarSalario(15.0)));
        Empregado Rafael = new Empregado();
        System.out.println("------------------------------------------------------------------------------------------------------");
        Rafael.setSalario(2.000);
        Rafael.setNome("Rafael de Almeida Ciebra");
        Rafael.setCargo("Estagiario de desenvolvimento de software");
        System.out.println(String.format("Nome do Empregado: %s", Rafael.getNome()));
        System.out.println(String.format("Cargo: %s", Rafael.getCargo()));
        System.out.println(String.format("Salario antes do reajuste: R$ %.3f", Rafael.getSalario()));
        System.out.println(String.format("Salario depois do reajuste: R$ %.3f", Rafael.reajustarSalario(20.5)));
        System.out.println("------------------------------------------------------------------------------------------------------");

    }
}
