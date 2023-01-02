package exercicios;

import java.util.Scanner;

public class Exercicio_1003 {
    public static void main(String[] args) {
        int A, B, SOMA = 0;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
