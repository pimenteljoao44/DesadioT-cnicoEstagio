import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");

        int numero = scan.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scan.close();
    }

    public static boolean verificarFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0, b = 1;

        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == num;
    }
}

