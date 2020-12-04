/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Faculdade {

    //Atributos
    private String nome;
    private Integer vagas;
    List<Professor> listaPC; //listaPC listaProfessoresECordenadores

    //Construtor
    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaPC = new ArrayList<>();
    }

    //Metodos
    public void contratarProfessor(Professor p) {
        if (listaPC.size() < vagas) {
            listaPC.add(p);
            System.out.println("Professor contratado !");
        } else {
            System.out.println("Infelizmente não há mais vagas. Matrícula não pode ser efetuada.");
        }
    }

    public void exibirProfessores() {
        for (Professor a : listaPC) {
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Faculdade{"
                + "\nnome=" + nome
                + "\nvagas=" + vagas
                + "\nlistaPC=" + listaPC
                + '}';
    }

}
