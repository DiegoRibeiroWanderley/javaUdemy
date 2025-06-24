package exerciciosIniciantes.exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class Proposto_1_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroHoras = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = numeroHoras * valorPorHora;
        System.out.printf("Número: %d\n", numero);
        System.out.printf("Salário: %.2f", salario);
        sc.close();
    }
}
