import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // interruptores e lâmpadas
        boolean[] interruptores = {false, false, false};
        boolean[] lampadas = {false, false, false};

        // Primeira ida
        System.out.println("1. Ligar um interruptor por alguns minutos e depois desligar.");
        System.out.println("2. Ir até as salas das lâmpadas.");

        // Primeira ida
        simularPrimeiraIda(interruptores, lampadas);

        // Segunda ida
        System.out.println("3. Agora, vá até as salas das lâmpadas novamente.");

        // Simulação da segunda ida e descoberta dos interruptores
        descobrirInterruptores(interruptores, lampadas);

        for (int i = 0; i < interruptores.length; i++) {
            System.out.println("Interruptor " + (i + 1) + " controla a Lâmpada " + (i + 1) + ": " + interruptores[i]);
        }

        scanner.close();
    }

    public static void simularPrimeiraIda(boolean[] interruptores, boolean[] lampadas) {
        for (int i = 0; i < interruptores.length; i++) {
            interruptores[i] = true;
        }

        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = interruptores[0] || interruptores[1] || interruptores[2];
        }
    }

    public static void descobrirInterruptores(boolean[] interruptores, boolean[] lampadas) {
        interruptores[0] = false;
        interruptores[1] = true;
        interruptores[2] = false;

        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = interruptores[0] || interruptores[1] || interruptores[2];
        }

        for (int i = 0; i < interruptores.length; i++) {
            interruptores[i] = false;
        }
    }
}
