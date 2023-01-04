package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1008 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("00.00");
        Scanner entrada = new Scanner(System.in);

        int numerofuncionario = entrada.nextInt();
        int horastrabalhadas = entrada.nextInt();
        float valorhora = entrada.nextFloat();

        float salario = horastrabalhadas * valorhora;

        System.out.println("NUMBER = " + numerofuncionario);
        System.out.println("SALARY = U$ " + df.format(salario));
    }
}
