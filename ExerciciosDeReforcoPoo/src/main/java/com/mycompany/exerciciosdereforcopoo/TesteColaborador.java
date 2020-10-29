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
public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador A = new Colaborador();
        Colaborador B = new Colaborador();
        Colaborador C = new Colaborador();
        Colaborador D = new Colaborador();
        Colaborador E = new Colaborador();

        Rh RecursosHumanos = new Rh();
        
        A.setNome("Rafael de Almeida Ciebra");
        A.setCargo("Estagiario de desenvolvimento de software");
        A.setSalario(2.000);
        A.exibeColaborador();
        B.setNome("Marcos Ribeiro da Costa");
        B.setCargo("Desenvolvedor java junior");
        B.setSalario(3.500);
        B.exibeColaborador();
        C.setNome("Otavio Vieira de Araujo");
        C.setCargo("Qa junior");
        C.setSalario(3.250);
        C.exibeColaborador();
        D.setNome("Gabriela Batista da Silva");
        D.setCargo("estagiaria de desenvolvimento frontend");
        D.setSalario(1.750);
        D.exibeColaborador();
        E.setNome("Marcela Belluci");
        E.setCargo("Desenvolvedora Kotlin Plena");
        E.setSalario(7.600);
        E.exibeColaborador();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("Situação do colaborador: "+ A.getNome());
        RecursosHumanos.promoverColaborador(A, "Desenvolvedor Java Junior", 3.500);
        System.out.println("Situação do colaborador: " + B.getNome());
        RecursosHumanos.promoverColaborador(B, "Desenvolvedor Java Pleno", 2.500);
        System.out.println("Situação do colaborador: " + C.getNome());
        RecursosHumanos.promoverColaborador(B, "Desenvolvedor Java Pleno", 5.500);
        System.out.println("Situação do colaborador: " + C.getNome());
        RecursosHumanos.promoverColaborador(B, "Desenvolvedor Java Pleno", 6.500);
        System.out.println("Situação do colaborador: " + E.getNome());
        RecursosHumanos.promoverColaborador(B, "Desenvolvedor Java Pleno", 6.700);
        A.exibeColaborador();
        B.exibeColaborador();
        C.exibeColaborador();
        D.exibeColaborador();
        E.exibeColaborador();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total de promocoes: " + RecursosHumanos.getTotalDePromovidos());
        System.out.println("Total de salarios reajustados: " + RecursosHumanos.getTotalSalariosReajustados());

        
    }
}
