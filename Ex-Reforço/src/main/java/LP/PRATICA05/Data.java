/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP.PRATICA05;

public class Data {
    private Integer dia , mes, ano;
    
    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
public void inicializaData(Integer dia, Integer mes, Integer ano){
this.dia = dia;
this.mes = mes;
this.ano = ano;

if (dia < 1 || dia > 31){
    System.out.println("Data Inválida");
    this.dia = 0;
} else if (mes < 1 || mes > 12){
    System.out.println("Data Inválida");
    this.mes = 0;
} else{
    this.dia = getDia();
    this.mes = getMes();
    this.ano = getAno();
}
}
public String exibeData(Integer dia, Integer mes, Integer ano){
 String Data = String.format("%d / %d / %d", dia, mes, ano);
 return Data;
}
public String comparaData(Data Data1, Data Data2){
       String mensagem;
    if(Data1.equals(Data2)){
      return mensagem =  "Datas Iguais";
    }    
      return mensagem =  "Datas Diferentes";
    



}  
}


