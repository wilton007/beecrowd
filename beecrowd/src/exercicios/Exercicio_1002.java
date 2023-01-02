package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####.0000");
        double R, resultado = 0.0;
        R = entrada.nextDouble();
        resultado = 3.14159 * (R*R);
        System.out.println("A="+df.format(resultado));

    }
}
