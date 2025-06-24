package exerciciosIniciantes.exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_3_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double soma = 0;
        int cont = 0;
        if (x > 0) {
            while (x > 0) {
                soma += x;
                cont += 1;
                x = sc.nextInt();
                if (x < 0) {
                    double media = soma / cont;
                    System.out.printf("%.2f", media);
                    break;
                }
            }
        } else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }
}
