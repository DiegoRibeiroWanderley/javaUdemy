package exerciciosIniciantes.exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class Proposto_1_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca_1 = sc.nextInt();
        int numeroPeca_1 = sc.nextInt();
        double valorPeca_1 = sc.nextDouble();
        int codigoPeca_2 = sc.nextInt();
        int numeroPeca_2 = sc.nextInt();
        double valorPeca_2 = sc.nextDouble();
        double valorTotal = numeroPeca_1 * valorPeca_1 + numeroPeca_2 * valorPeca_2;
        System.out.printf("Valor a pegar: %.2f", valorTotal);
        sc.close();
    }
}
