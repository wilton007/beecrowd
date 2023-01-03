package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercico_1009 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
        double salario = entrada.nextDouble();
        double vendas = entrada.nextDouble();

        double salariototal = (vendas * 15 / 100) + salario;

        System.out.println("TOTAL = R$ " + df.format(salariototal));
    }
}
