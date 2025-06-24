package exerciciosIniciantes.exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_2_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        media = nota1 + nota2;
        if (media > 60.0){
            System.out.printf("Nota final: %.1f", media);
        }else{
            System.out.printf("Nota final: %.1f\n", media);
            System.out.println("REPROVADO!");
        }
        sc.close();
    }
}
