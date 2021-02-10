/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rafael.ciebra.c3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class ClinicaDentaria {

    //Atributos
    private String nome;
    private Integer vagas;
    List<DentistaClinico> listaDentista;

    //Construtor
    public ClinicaDentaria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaDentista = new ArrayList<>();
    }

    //Métodos
    public void contratarDentista(DentistaClinico dentista) {
        if (listaDentista.size() < vagas) {
            listaDentista.add(dentista);
            System.out.println("Dentista contratado");
        } else {
            System.out.println("A clínica " + nome + " não possuí vagas disponíveis");
        }
    }

    public void exibirTodos() {
        for (DentistaClinico d : listaDentista) {
            if (listaDentista.isEmpty()) {
                System.out.println("\nA clínica " + nome + " não possui dentistas");
            } else {
                System.out.println(d);
            }
        }
    }

    public void exibirDentistaCirurgiao() {
        if (listaDentista.isEmpty()) {
            System.out.println("A clínica " + nome + " não possui dentistas");
        } else {
            for (DentistaClinico d : listaDentista) {
                if (d instanceof DentistaCirurgiao) {
                    System.out.println(d);
                }
            }
        }
    }
     public Double calculaTotalSalario() {
        Double total = 0.0;
        for (DentistaClinico a : listaDentista) {
            total += a.calcularSalario();
        }
        return total;
    }

    public void exibirFolhaDePagamento() {
       for (DentistaClinico d : listaDentista) {           
           System.out.println("Nome: " + d.getNome()+ " " + " salário: " + d.calcularSalario());
       }
        
            System.out.println("\nVALOR TOTAL A SER PAGO (SOMA DE TODOS OS SALÁRIOS:)");
            System.out.println("R$" + calculaTotalSalario());
            System.out.println("\nQUANTIDADE DE DENTISTAS NA CLÍNICA:");
            System.out.println(listaDentista.size());

        
    }

    @Override
    public String toString() {
        return "\nClinicaDentaria{"
                + "\nnome=" + nome
                + "\nvagas=" + vagas
                + "\nvagas disponiveis=" + (vagas - listaDentista.size())
                + "\nlistaDentista=" + listaDentista
                + '}';
    }

    public Integer getVagas() {
        return vagas;
    }

}
