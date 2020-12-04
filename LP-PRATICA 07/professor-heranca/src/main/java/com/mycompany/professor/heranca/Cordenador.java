/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.professor.heranca;

/**
 *
 * @author rafae
 */
public class Cordenador extends Professor {

    //Atributos
    private Integer qtdHorasCordenador;
    private Double valorHoraCoord;
    private String curso;

    //Construtor
    public Cordenador(String curso, String nome, Integer codigo, Integer qtdHoras, Double valorHora, Integer qtdHorasCordenador, Double valorHoraCoord) {
        super(nome, codigo, qtdHoras, valorHora);
        this.qtdHorasCordenador = qtdHorasCordenador;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    //Metodo sobrescrevido
    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + ((this.qtdHorasCordenador * this.valorHoraCoord) * 4.5);
    }
    
    //toString

    @Override
    public String toString() {
        return "Cordenador{" 
                + "\nqtdHorasCordenador=" + qtdHorasCordenador 
                + "\nvalorHoraCoord=" + valorHoraCoord 
                + "\ncurso=" + curso 
                + "\nsalario Cordenador=" + calculaSalario() 
                + '}';
    }
    

}
