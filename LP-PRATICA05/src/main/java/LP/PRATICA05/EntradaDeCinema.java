/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP.PRATICA05;

/**
 *
 * @author rafae
 */
public class EntradaDeCinema {
    private Integer ano;
    private Integer hora;
    private Integer sala;
    private Double valor;
    private String nome;

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getSala() {
        return sala;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
     public Integer getHora() {
        return hora;
    }

    public Double calculaDesconto(Integer idadeCliente, Boolean ConfirmaçãoEstudante){
        Double desconto = 0.00;
        if(idadeCliente < 12 && ConfirmaçãoEstudante.equals(true)){
          desconto = valor * 0.5;
        } else if ((idadeCliente >= 12 || idadeCliente <=15) && ConfirmaçãoEstudante.equals(true)){
          desconto = valor * 0.4;
        } else if ((idadeCliente >= 16 || idadeCliente <=20) && ConfirmaçãoEstudante.equals(true)){
          desconto = valor * 0.3;
        } else if ( idadeCliente > 20 && ConfirmaçãoEstudante.equals(true)){
          desconto = valor * 0.2;   
          }
        return valor = valor - desconto;
    }
    public Double calculaDescontoHorario(){
        Double desconto = 0.00;
        if (hora < 16){
        desconto = valor*0.1;
        }
        return valor = valor - desconto;
    }
    
    
}
