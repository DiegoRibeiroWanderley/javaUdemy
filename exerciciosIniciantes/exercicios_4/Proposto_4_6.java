package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Proposto_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            if (num % i == 0){
                System.out.println(num / i);
            }
        }

        sc.close();
    }
}
