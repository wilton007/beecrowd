package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1006 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        double a, b, c, media;
        Scanner entrada = new Scanner(System.in);

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
        System.out.println("MEDIA = " + df.format(media));
    }
}
