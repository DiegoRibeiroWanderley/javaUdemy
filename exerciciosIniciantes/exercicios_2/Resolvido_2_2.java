package exerciciosIniciantes.exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_2_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, raiz1, raiz2;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = (b * b) - 4.0 * a * c;
        raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        if (delta <= 0 || a == 0) {
            System.out.println("Impossível calcular.");
        } else {
            System.out.printf("Raiz 1 = %.5f\n", raiz1);
            System.out.printf("Raiz 2 = %.5f\n", raiz2);
        }
        sc.close();
    }
}
