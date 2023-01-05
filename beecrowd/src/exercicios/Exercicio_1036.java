package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1036 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        double R1, R2;
        Scanner entrada;
        entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        if (A == 0)
            System.out.println("Impossivel calcular");
        else {
            double delta = (B * B) - (4 * A * C);

            if (delta > 0) {
                R1 = (-B + Math.sqrt(delta)) / (2 * A);
                R2 = (-B - Math.sqrt(delta)) / (2 * A);

                System.out.println("R1 = " + df.format(R1));
                System.out.println("R2 = " + df.format(R2));
            }else {
                System.out.println("Impossivel calcular");
            }
        }

    }

}