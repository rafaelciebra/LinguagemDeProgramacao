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
public class Carro {
    private Integer idCarro;
  private String modelo;
  private Integer placa;
  private Boolean estaAlugado;
  private Boolean estaEmConcerto;
  private Double valorAluguelDia;
  private Integer qtdDias;
  
  public Double calcularTotalAluguel(){
  return valorAluguelDia*qtdDias;
}
//seters
    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public void setEstaAlugado(Boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

    public void setEstaEmConcerto(Boolean estaEmConcerto) {
        this.estaEmConcerto = estaEmConcerto;
    }

    public void setValorAluguelDia(Double valorAluguelDia) {
        this.valorAluguelDia = valorAluguelDia;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }
//geters
    public Integer getIdCarro() {
        return idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPlaca() {
        return placa;
    }

    public Boolean getEstaAlugado() {
        return estaAlugado;
    }

    public Boolean getEstaEmConcerto() {
        return estaEmConcerto;
    }

    public Double getValorAluguelDia() {
        return valorAluguelDia;
    }

    public Integer getQtdDias() {
        return qtdDias;
    }
 
}
