package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercico_1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));


        System.out.println(df.format(Math.sqrt(distancia)));
    }
}
