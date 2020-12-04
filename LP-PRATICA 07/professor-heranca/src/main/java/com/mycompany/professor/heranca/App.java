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
public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor("Paulo Almeida",10,35,25.00);
        Professor p2 = new Professor("Lenir",20,30,20.00);
        Faculdade bandtec = new Faculdade("Bandtec",35);
        
        System.out.println("\nCONTRATANDO PROFESSORES");
        bandtec.contratarProfessor(p1);
        bandtec.contratarProfessor(p2);
        System.out.println("\nPROFESSORES CADASTRADOS");
        bandtec.exibirProfessores();
        System.out.println("\nSALÁRIO DOS PROFESSORES");
        System.out.println(p1.calculaSalario());
        System.out.println(p2.calculaSalario());
        System.out.println("\nINFORMAÇÕES DA FACULDADE");
        System.out.println(bandtec);

    }
}
