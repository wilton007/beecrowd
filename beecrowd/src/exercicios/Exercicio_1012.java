package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1012 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double trianguloretangular = a * c / 2;
        double circulo = 3.141590 * (c * c);
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;


        System.out.println("TRIANGULO: " + df.format(trianguloretangular));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));



    }
}
