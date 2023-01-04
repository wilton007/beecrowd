package exercicios;

import java.util.Scanner;

public class Exercicio_1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int comein = input.nextInt();
        int years = comein / 365;
        comein = comein % 365;
        int months = comein / 30;
        comein = comein % 30;
        int days = comein;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");


    }
}
