package exercicios;

import java.util.Scanner;

public class Exercicio_1004 {
    public static void main(String[] args) {
        int A, B, PROD = 0;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
}
