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
public class BilheteUnico {
    private String cpf;
    private Double saldo;
    private String titular;
    private Boolean passagemComum; 
    
    
    public void recarregar(Double valorRecarga){
        saldo += valorRecarga;
        if(saldo+valorRecarga > 250){
            setSaldo(250.0);
            System.out.println("Valor da recarga: R$" + valorRecarga);
            System.out.println("Bilhete totalmente recarregado");
            System.out.println("Saldo Atual: R$" + saldo);
        }   else{
            System.out.println("Valor da recarga: " + valorRecarga);
            System.out.println("Saldo Atual: R$" + saldo);
        }
    }
    public void passagemComum(){
            if(saldo<4.50){            
            System.out.println("Saldo insuficiente");  
            System.out.println("Saldo Atual: R$" + saldo);                   
          } else{
                     saldo -= 4.50;
                     System.out.println("Saldo Atual: R$" + saldo);
                     setPassagemComum(true);
           }               
    }
    public void passagemIntegracao(){
            if(passagemComum){       
                  if (saldo>1.50){
                      saldo -=1.50;
                      System.out.println("Debitado R$1.50");
                      System.out.println("Saldo Atual: R$" + saldo);
                      setPassagemComum(false);
                  } else {
                      System.out.println("Saldo insuficiente"); 
                      System.out.println("Saldo Atual: R$" + saldo);
                  }
            }       
    }

    public BilheteUnico(String cpf, Double saldo, String titular, Boolean passagemComum) {
        this.cpf = cpf;
        this.saldo = saldo;
        this.titular = titular;
        this.passagemComum = passagemComum;
    }

    public void exibir(){
        System.out.println("------------DADOS--------------");
        System.out.println("CPF: "+cpf);
        System.out.println("SALDO: "+saldo);
        System.out.println("TITULAR: "+titular);
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Boolean getPassagemComum() {
        return passagemComum;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setPassagemComum(Boolean passagemComum) {
        this.passagemComum = passagemComum;
    }

    
    
}
