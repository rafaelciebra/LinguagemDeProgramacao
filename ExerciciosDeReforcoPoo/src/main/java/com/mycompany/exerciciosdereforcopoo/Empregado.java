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
public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;
    
    public Double reajustarSalario(Double reajuste){
        Double NovoSalario;
         reajuste = (reajuste*0.01)*salario;
         NovoSalario = salario + reajuste;
         return NovoSalario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }
    
}
