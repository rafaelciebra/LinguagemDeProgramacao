/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio;

/**
 *
 * @author rafae
 */
public class TesteProcessoSeletivo {
    public static void main(String[] args) {
       Candidato c1 = new Candidato(10,"João","ADS");
       Candidato c2 = new Candidato(20,"Maria","CCO");
       Candidato c3 = new Candidato(30,"Antônio","CCO");
       ProcessoSeletivo bandtec = new ProcessoSeletivo();
       
       bandtec.exibeInfoCandidato(c1);
       bandtec.exibeInfoCandidato(c2);
       bandtec.exibeInfoCandidato(c3);

       //registrando prova para c1 e c2 e exibindo infos dos candidatos e seus status
       bandtec.registraProva(c1, 7.5);
       bandtec.exibeInfoCandidato(c1);
       bandtec.registraProva(c3, 6.7); 
       bandtec.exibeInfoCandidato(c3);
       bandtec.exibeInfoCandidato(c2);
       //registrando dinamica para c1 e exibindo infos dos candidatos e seus status
       bandtec.registraDinamica(c1, 9.5);
       bandtec.exibeInfoCandidato(c1);
       
       bandtec.exibeRelatorio();

    }
}
