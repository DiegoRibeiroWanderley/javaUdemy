package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Proposto_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fatorial = 1;
        for(int i = num;i>0;i--){
            fatorial *= i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}
