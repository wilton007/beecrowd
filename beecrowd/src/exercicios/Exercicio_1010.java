package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_1010 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        Scanner entrada = new Scanner(System.in);

        int codigoproduto1 = entrada.nextInt();
        int quantidadeproduto1 = entrada.nextInt();
        double valorunidadeproduto1 = entrada.nextDouble();

        int codigoproduto2 = entrada.nextInt();
        int quantidadeproduto2 = entrada.nextInt();
        double valorunidadeproduto2 = entrada.nextDouble();

        double total = (quantidadeproduto1 * valorunidadeproduto1) + (quantidadeproduto2 * valorunidadeproduto2);

        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
    }
}
