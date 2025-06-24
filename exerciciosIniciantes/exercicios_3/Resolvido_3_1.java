package exerciciosIniciantes.exercicios_3;

import java.util.Scanner;

public class Resolvido_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != y) {
            if (x > 0) {
                System.out.println("Decrescente");
            } else if (x < 0) {
                System.out.println("Crescente");
            } else {
                break;
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
