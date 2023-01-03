package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1011 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.000");
        Scanner entrada = new Scanner(System.in);

        double R = entrada.nextDouble();

        double volume = (4 / 3.0) * 3.14159 * (R * R * R);
        System.out.println("VOLUME = " + df.format(volume));
    }
}
