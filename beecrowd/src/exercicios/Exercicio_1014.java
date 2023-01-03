package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1014 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        int km = input.nextInt();
        double combustivel = input.nextDouble();

        double total = km / combustivel;

        System.out.println(df2.format(total) + " km/l");
    }
}
