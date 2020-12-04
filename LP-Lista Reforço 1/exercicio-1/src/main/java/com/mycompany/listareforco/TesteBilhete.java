/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listareforco;

/**
 *
 * @author Aluno
 */
public class TesteBilhete {
    public static void main(String[] args) {
        BilheteUnico bilhete1 = new BilheteUnico("518795318-44",1.00, "Rafael Ciebra", true);
        bilhete1.exibir();
        System.out.println("------------RECARGA-------------");
        bilhete1.recarregar(0.0);
        System.out.println("------PASSAGEM COMUM------------");
        bilhete1.passagemComum();
        System.out.println("------PASSAGEM INTEGRAÇÃO------------");
        bilhete1.passagemIntegracao();
        
    }
    
    
    
}
