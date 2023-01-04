package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1017 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        int horas = input.nextInt();
        int km = input.nextInt();

        double gasto = (double) (km * horas) / 12;

        System.out.println(df.format(gasto));
    }
}
