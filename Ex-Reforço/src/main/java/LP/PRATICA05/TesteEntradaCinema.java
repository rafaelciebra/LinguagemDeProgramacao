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
public class TesteEntradaCinema {
    public static void main(String[] args) {
     EntradaDeCinema id001 = new EntradaDeCinema();
     EntradaDeCinema id002 = new EntradaDeCinema();
     System.out.println("-------------Bilhete 1----------------");
     id001.setValor(50.0);
     id001.calculaDesconto(25, true);
     System.out.println("Subtotal: R$" + id001.getValor());
     id001.setHora(18);
     System.out.println("descontado: R$" + id001.calculaDescontoHorario());
     System.out.println("Horario de exibicao: "+ id001.getHora()+ "horas ");
     id001.setNome("Vingadores Ultimato");
     System.out.println("Filme: " + id001.getNome());
     id001.setAno(2019);
     System.out.println("Ano: "+id001.getAno()); 
     id001.setSala(5);
     System.out.println("Sala de Exibicao: "+id001.getSala()); 

     System.out.println("-------------Bilhete 2----------------");
     id002.setValor(50.0);
     id002.calculaDesconto(10, true);
     System.out.println("Subtotal: R$" + id002.getValor());
     id002.setHora(12);
     System.out.println("descontado: R$" + id002.calculaDescontoHorario());
     System.out.println("Horario de exibicao: "+ id002.getHora()+ "horas ");
     id002.setNome("One Piece");
     System.out.println("Filme: " + id002.getNome());
     id002.setAno(2001);
     System.out.println("Ano: "+id002.getAno()); 
     id002.setSala(4);
     System.out.println("Sala de Exibicao: "+id002.getSala()); 


    
     
    /*
     id002.setValor(50.00);
     id002.calculaDesconto(25, true);
     id002.setHora(12);
     id002.calculaDescontoHorario();
     id002.setAno(2019);
     id002.setSala(2);
     id002.setNome("Coringa");
     System.out.println("------------------------------");
*/
    }
    

   
}
