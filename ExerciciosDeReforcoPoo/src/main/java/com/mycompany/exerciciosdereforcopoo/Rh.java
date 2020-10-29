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
public class Rh {
    private Integer totalDePromovidos = 0;
    private Integer totalSalariosReajustados = 0;
    
    
    public void reajustarSalario(Colaborador colaborador, Double valorReajuste){
    Double NovoSalario = colaborador.getSalario() * (1 + valorReajuste/100);
    colaborador.setSalario(NovoSalario);  
    totalSalariosReajustados++;
    }
   public void promoverColaborador(Colaborador colaborador, String NovoCargo, Double NovoSalario){
        if (NovoSalario > colaborador.getSalario()){
            colaborador.setCargo(NovoCargo);
            colaborador.setSalario(NovoSalario);
            totalDePromovidos++;
            System.out.println("Colaborador Promovido");
        } else{
            System.out.println("Operação invalida!");
        }
    }

    public Integer getTotalDePromovidos() {
        return totalDePromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }
   
}

