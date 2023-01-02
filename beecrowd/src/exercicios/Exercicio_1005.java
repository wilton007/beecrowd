package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1005 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        double a, b, media;
        Scanner entrada = new Scanner(System.in);

        a = entrada.nextDouble();
        b = entrada.nextDouble();

        media = ((a * 3.5 ) + (b * 7.5)) / (3.5 + 7.5);
        System.out.println("MEDIA = " + df.format(media));


    }
}
