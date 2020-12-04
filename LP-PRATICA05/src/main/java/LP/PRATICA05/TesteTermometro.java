
package LP.PRATICA05;


public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setTemperaturaAtual(23.0);
        termometro.setTemperaturaMaxRegistrada(23.0);
        termometro.setTemperaturaMinRegistrada(23.0);
        
        System.out.println(String.format("temperatura atual: %.1fC", termometro.getTemperaturaAtual()));
        System.out.println(String.format("temperatura maxima registrada: %.1fC", termometro.getTemperaturaMaxRegistrada()));
        System.out.println(String.format("temperatura minima registrada: %.1fC", termometro.getTemperaturaMinRegistrada()));

        termometro.aumentaTemperatura(3.0);
        termometro.aumentaTemperatura(5.0);
        System.out.println(String.format("temperatura atual: %.1fC", termometro.getTemperaturaAtual()));
        System.out.println(String.format("temperatura maxima registrada: %.1fC", termometro.getTemperaturaMaxRegistrada()));
        System.out.println(String.format("temperatura minima registrada: %.1fC", termometro.getTemperaturaMinRegistrada()));

        termometro.diminuiTemperatura(10.0);
        termometro.diminuiTemperatura(2.0);
        System.out.println(String.format("temperatura atual: %.1fC", termometro.getTemperaturaAtual()));
        System.out.println(String.format("temperatura maxima registrada: %.1fC", termometro.getTemperaturaMaxRegistrada()));
        System.out.println(String.format("temperatura minima registrada: %.1fC", termometro.getTemperaturaMinRegistrada()));
       
        System.out.println(String.format("temperatura convertida para Fereheint: %.1fF", termometro.converterParaFereheint()));
    }
}

