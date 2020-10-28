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
public class TesteData {
    public static void main(String[] args) {
    Data a = new Data();
    Data b = new Data();
    
    a.inicializaData(20, 9, 2001);  
    b.inicializaData(20, 9, 2001);
        System.out.println("---------------------------------------------");
        System.out.println(a.exibeData(a.getDia(), a.getMes(), a.getAno()));
        System.out.println(b.exibeData(b.getDia(), b.getMes(), b.getAno()));
        System.out.println(a.comparaData(a, b));
        
    }
}
