/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP.PRATICA05;
import java.util.Random;

public class Termometro {
     private Double temperaturaAtual;
     private Double temperaturaMaxRegistrada;
     private Double temperaturaMinRegistrada;
    Random gerarTemp = new Random();

    public void aumentaTemperatura(Double aumentaTemp){
       temperaturaAtual = temperaturaAtual+aumentaTemp;
       if(temperaturaAtual > temperaturaMaxRegistrada){
       this.temperaturaMaxRegistrada = temperaturaAtual;
    }
}
     public void diminuiTemperatura(Double diminuiTemp){
       temperaturaAtual = temperaturaAtual-diminuiTemp;
    if(temperaturaAtual < temperaturaMinRegistrada){
       this.temperaturaMinRegistrada = temperaturaAtual;
    }
}
     public Double converterParaFereheint(){
         Double F = temperaturaAtual*1.8+32.0;
         return F;
     }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void setTemperaturaMaxRegistrada(Double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }

    public void setTemperaturaMinRegistrada(Double temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    

}
