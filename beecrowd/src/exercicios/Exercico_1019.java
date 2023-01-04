package exercicios;

import java.util.Scanner;

public class Exercico_1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int comein = input.nextInt();
        int hora = comein / 3600;
        comein = comein % 3600;
        int minutos = comein / 60;
        comein = comein % 60;
        int segundos = comein;


        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}
