package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Resolvido_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int cont = 1; cont <= 10; cont++){
            System.out.printf("%d x %d = %d\n", num, cont, cont * num);
        }

            sc.close();
    }
}
