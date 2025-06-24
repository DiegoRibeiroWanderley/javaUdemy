package exerciciosIniciantes.exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Proposto_2_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String quadrante;
        if (x > 0 && y > 0) {
            quadrante = "Q1";
        } else if (x < 0 && y > 0) {
            quadrante = "Q2";
        } else if (x < 0 && y < 0) {
            quadrante = "Q3";
        } else if (x > 0 && y < 0) {
            quadrante = "Q4";
        } else if (x == 0 && y != 0) {
            quadrante = "Eixo Y";
        } else if (x != 0) {
            quadrante = "Eixo X";
        } else {
            quadrante = "Origem";
        }
        System.out.println(quadrante);
        sc.close();
    }
}
