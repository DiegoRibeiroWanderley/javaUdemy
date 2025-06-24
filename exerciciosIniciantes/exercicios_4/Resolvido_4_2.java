package exerciciosIniciantes.exercicios_4;

import java.util.Scanner;

public class Resolvido_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMaior, numMenor;
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y){
            numMaior = y;
            numMenor = x;
        }else{
            numMaior = x;
            numMenor = y;
        }
        int soma = 0;
        for (int i = numMaior - 1; i > numMenor; i--) {
            if (i % 2 == 1 || i % 2 == -1){
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
