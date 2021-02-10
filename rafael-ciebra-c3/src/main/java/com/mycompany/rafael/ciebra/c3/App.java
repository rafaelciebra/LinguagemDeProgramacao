/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rafael.ciebra.c3;

/**
 *
 * @author rafae
 */
public class App {

    public static void main(String[] args) {
        //Objetos DentistaClinico
        DentistaClinico d1 = new DentistaClinico(10, "João", 20, 130.0);
        DentistaClinico d2 = new DentistaClinico(20, "Maria", 30, 150.0);
        
        //objetos DentistaCirurgiao
        DentistaCirurgiao d3 = new DentistaCirurgiao(30, "Rafael", 10, 200.0, 5, 450.0);
        DentistaCirurgiao d4 = new DentistaCirurgiao(40, "Daniela", 5, 90.0, 25, 320.0);
        
        //objeto ClinicaDentaria
        ClinicaDentaria clinica = new ClinicaDentaria("Bom Dente", 35);
        
        //invocando o método exibirTodos()
        clinica.exibirTodos();
        
        //Contratando todos os dentistas criados através de meu método.
        System.out.println("\nCONTRATANDO DENTISTAS: ");
        clinica.contratarDentista(d1);
        clinica.contratarDentista(d2);
        clinica.contratarDentista(d3);
        clinica.contratarDentista(d4);
        
        //invocando o método exibirTodos() novamente
        System.out.println("\nEXIBINDO TODOS OS DENTISTAS: ");
        clinica.exibirTodos();
        
        // Invocando o método exibirDentistaCirurgiao.
        System.out.println("\nDENTISTAS CIRURGIÕES: ");
        clinica.exibirDentistaCirurgiao();
        
        //Invocando o método exibirFolhaDePagamento.
        System.out.println("\nFOLHA DE PAGAMENTO: ");
        clinica.exibirFolhaDePagamento();
        
        //Exibindo os dados da clínica (nome, vagas, vagas disponíveis e os dentistas contratados).
        System.out.println("\nDADOS DA CLÍNICA: ");
        System.out.println(clinica);
    }
}
