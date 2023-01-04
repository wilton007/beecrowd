package exercicios;


import java.util.Scanner;

public class Exercico_1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double N = input.nextDouble();
        System.out.println("NOTAS:");
        System.out.println(((int) (N / 100.0)) + " nota(s) de R$ 100.00");
        N = N % 100;
        System.out.println((int) (N / 50.0) + " nota(s) de R$ 50.00");
        N = N % 50;
        System.out.println((int) (N / 20.0) + " nota(s) de R$ 20.00");
        N = N % 20;
        System.out.println((int) (N / 10.0) + " nota(s) de R$ 10.00");
        N = N % 10;
        System.out.println((int) (N / 5.0) + " nota(s) de R$ 5.00");
        N = N % 5;
        System.out.println((int) (N / 2.0) + " nota(s) de R$ 2.00");
        N = N % 2;
        System.out.println("MOEDAS:");
        System.out.println((int) (N / 1) + " moeda(s) de R$ 1.00");
        N = N % 1;
        System.out.println((int) (N / 0.50) + " moeda(s) de R$ 0.50");
        N = N % 0.50;
        System.out.println((int) (N / 0.25) + " moeda(s) de R$ 0.25");
        N = N % 0.25;
        System.out.println((int) (N / 0.10) + " moeda(s) de R$ 0.10");
        N = N % 0.10;
        System.out.println((int) (N / 0.05) + " moeda(s) de R$ 0.05");
        N = N % 0.05;
        System.out.println((int) (N / 0.01) + " moeda(s) de R$ 0.01");


    }
}
