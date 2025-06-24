package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Proposto_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d\n", i, quadrado, cubo);
        }

        sc.close();
    }
}
