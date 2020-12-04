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
public class ProcessoSeletivo {
    private Integer totalProva;
    private Integer totalDinamica;
    private Integer totalAprovado;
    
    public void registraProva(Candidato c1, Double notaProva){
            c1.setFezProva(true);
            c1.setNotaProva(notaProva);
            totalProva++;
            if(notaProva>7){                  
                System.out.println("-O(a) candidato(a) "+c1.getNome()+" de id: "+c1.getIdCandidato()+
                        " realizou a prova e tirou nota "+c1.getNotaProva());
                System.out.println("-O candidato será chamado para a dinâmica");
            } else{
                System.out.println("-O(a) candidato(a) "+c1.getNome()+" de id: "+c1.getIdCandidato()+
                        " realizou a prova e tirou nota "+c1.getNotaProva());
                System.out.println("-O candidato não será chamado para a dinâmica");
              }
    }
    
    public void registraDinamica(Candidato c1, Double notaDinamica){
            if(!c1.getFezProva()){
                System.out.println("-ERRO, este(a) candidato(a) não realizou a prova da 1ºfase"
                        + " sua dinâmica não será considerada ");
            } 
            c1.setNotaDinamica(notaDinamica);  
            totalDinamica++;
            if(c1.calcularMedia()>7){
               c1.setAprovado(true);
                System.out.println("-O(a) candidato(a) "+c1.getNome()+" de id: "+c1.getIdCandidato()+
                        " realizou a dinâmica e tirou nota "+c1.getNotaDinamica()+" e foi aprovado(a)"
                                + " com média "+c1.calcularMedia());   
            totalAprovado++;
            }else{
                c1.setAprovado(false);
                System.out.println("-O(a) candidato(a) "+c1.getNome()+" de id: "+c1.getIdCandidato()+
                        " realizou a dinâmica e tirou nota "+c1.getNotaDinamica()+" e foi reprovado(a)"
                                + " com média "+c1.calcularMedia()); 
            }           
    }
    public void exibeInfoCandidato(Candidato c1){
        
        System.out.println("----------STATUS DO(A) CANDIDATO(A)----------");
        System.out.println("ID: " + c1.getIdCandidato());
        System.out.println("NOME: "+ c1.getNome());
        System.out.println("CURSO: "+c1.getCursoDesejado());
        System.out.println("NOTA PROVA: "+c1.getNotaProva());
        System.out.println("NOTA DINÂMICA: "+c1.getNotaDinamica());
         if(c1.getAprovado()&& c1.getNotaDinamica()>7){
                    System.out.println("STATUS: aprovado(a)");          
        }else if (!c1.getAprovado() && c1.getNotaProva()<7){
                    System.out.println("STATUS: reprovado(a)");
        }else if(c1.getFezProva() && c1.getNotaProva()>7){
                    System.out.println("STATUS: Aguardando ser chamado(a) para a dinâmica");
        }else if(!c1.getFezProva()){
                    System.out.println("STATUS: Aguardando ser chamado(a) para a prova");
        }
        System.out.println("--------------------------------------------");
    }
    
     public void exibeRelatorio(){
        System.out.println("-----------------RELATORIO-------------------");
         System.out.println("Quantidade de provas realizadas: " + totalProva);
         System.out.println("Quantidade de dinâmicas realizadas: " + totalDinamica);
         System.out.println("Quantidade de aprovações: " + totalAprovado);

     }
     //construtor
    public ProcessoSeletivo() {
        this.totalAprovado=0;
        this.totalDinamica=0;
        this.totalProva=0;
    }

    @Override
    public String toString() {
        return "ProcessoSeletivo{" + "totalProva=" + totalProva + ", totalDinamica=" + totalDinamica + ", totalAprovado=" + totalAprovado + '}';
    }
     
    
}
