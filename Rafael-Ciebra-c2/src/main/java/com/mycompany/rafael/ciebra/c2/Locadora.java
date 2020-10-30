/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rafael.ciebra.c2;

/**
 *
 * @author Aluno
 */
public class Locadora {
     private Integer totalAlugados = 0;
    private Integer totalManutencao = 0;
    private Integer totalDevolvidos = 0;
    
    public void registraAluguel(Carro idCarro, Carro qtdDias, Carro estaAlugado, Carro estaEmConserto){
        if (estaAlugado.equals(false)||(estaEmConserto.equals(false))){
            estaAlugado.setEstaAlugado(true);
            idCarro.getQtdDias();
            System.out.println("O carro " + idCarro.getModelo() + " de id " +
                    idCarro.getIdCarro() +  " está sendo alugado por " +
                    idCarro.getQtdDias() + " dias pelo valor de " +
                    idCarro.getValorAluguelDia());
                    totalAlugados++;

        } else{
            System.out.println("Este carro não pode ser alugado no momento");          
        }
    }
    
    public void registraDevolucao(Carro idCarro){
idCarro.setEstaAlugado(false);  
        System.out.println("O carro " + idCarro.getModelo() + " de id " +
                idCarro.getIdCarro() + " está sendo devolvido");
    }
    
     public void registraManutencao(Carro idCarro){
idCarro.setEstaEmConcerto(true);
        System.out.println("O carro " + idCarro.getModelo() + " de id " +
                idCarro.getIdCarro() + " está sendo retirado para manutenção");
        
        if (idCarro.getEstaAlugado().equals(true)){
            idCarro.setEstaAlugado(false);
            totalDevolvidos++;
            totalManutencao++;
        } 

    }
     
    public Integer getTotalManutencao() {
        return totalManutencao;
    }

    public Integer getTotalDevolvidos() {
        return totalDevolvidos;
    }
     
    public void exibeInfoCarro(Carro idCarro){
        String mensagem = "";
        if (idCarro.getEstaAlugado().equals(true)){
            mensagem = "(Alugado) (Disponivel)";
        } else if (idCarro.getEstaEmConcerto().equals(true)){
            mensagem = "(Em manutencao)";
        } 
        System.out.println("SITUACAO DO CARRO:");
        System.out.println("ID: " + idCarro.getIdCarro());
        System.out.println("Modelo: " + idCarro.getModelo());
        System.out.println("Placa: " + idCarro.getPlaca());
        System.out.println("status: " + mensagem );
        System.out.println("Valor do Aluguel p/dia: R$" + idCarro.getValorAluguelDia());
    }
    
    public void exibirRelatorio(){
        System.out.println("---------------------RELATORIO---------------------");
        System.out.println("Alugueis Realizados: " + totalAlugados );
        System.out.println("Manutenções realizadas: " + totalManutencao);
        System.out.println("Devolucoes realizadas: " + totalDevolvidos);
    }
}
