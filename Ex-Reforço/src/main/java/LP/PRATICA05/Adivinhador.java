/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP.PRATICA05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Adivinhador {
      private Integer tentativas = 1;

    public String adivinhar(Integer escolha) {
        String output;
        if (escolha > 50 || escolha < 0) {
            return "O numero deve ser Entre 0 e 50";
        }
        
        Integer sorteio = ThreadLocalRandom.current().nextInt(0, 51);
        List<String> Frases = new ArrayList<String>();

        while (!escolha.equals(sorteio)) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 51);

            Frases.add(String.format("\nTentativa %d, Numero sorteado: %d\n", tentativas, sorteio));
            tentativas++;
        }
        
        Frases.add("\n-------------------------------------------\n");
        Frases.add(String.format("\nO numero %d, foi sorteado após %d tentativas\n", escolha, (tentativas - 1)));
        
        output = Frases.toString();
        
        return output;
    }
}
