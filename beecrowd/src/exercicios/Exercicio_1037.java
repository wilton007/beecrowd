package exercicios;

import java.util.Scanner;

public class Exercicio_1037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();

        if (A < 0 && A > 100) {
            System.out.println("Fora de intervalo");

        } else if (A >= 0 && A <= 25.0000) {
            System.out.println("Intervalo [0,25]");

        } else if (A >= 25.00001 && A <= 50.0000000) {
            System.out.println("Intervalo (25,50]");

        } else if (A >= 50.00000001 && A <= 75.000000000) {
            System.out.println("Intervalo (50,75]");

        } else if (A >= 75.0000000001 && A <= 100) {
            System.out.println("Intervalo (75,100]");

        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
