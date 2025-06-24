package exerciciosIniciantes.exercicios_3;

import java.util.Scanner;

public class Proposto_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        int alcoolNota = 0, gasolinaNota = 0, dieselNota = 0;
        while (nota != 4){
            if(nota == 1){
                alcoolNota += 1;
            }else if(nota == 2){
                gasolinaNota += 1;
            }else if(nota == 3){
                dieselNota += 1;
            }
            nota = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcoolNota);
        System.out.printf("Gasolina: %d\n", gasolinaNota);
        System.out.printf("Diesel: %d\n", dieselNota);

        sc.close();
    }
}
