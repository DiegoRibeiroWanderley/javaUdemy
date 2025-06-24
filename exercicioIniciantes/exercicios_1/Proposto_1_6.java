package exerciciosIniciantes.exercicios_1;

import java.util.Scanner;
import java.util.Locale;

public class Proposto_1_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * Math.pow(C, 2);
        double areaTrapezio = ((A + B) / 2) * C;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;
        System.out.printf("Triangulo: %.3f\n", areaTriangulo);
        System.out.printf("Círculo: %.3f\n", areaCirculo);
        System.out.printf("Trapézio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retângulo: %.3f\n", areaRetangulo);
        sc.close();
    }
}
