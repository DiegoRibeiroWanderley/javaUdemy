package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Proposto_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = sc.nextInt();
        int in = 0, out = 0;
        for (int i = 0; i < cont; i++) {
            int num = sc.nextInt();
            if(num <= 20 && num >= 10){
                in ++;
            }else{
                out ++;
            }
        }
        System.out.printf("%d in\n%d out\n", in, out);

        sc.close();
    }
}
