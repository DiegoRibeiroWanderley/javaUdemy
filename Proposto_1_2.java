package exerciciosIniciantes.exercicios_1;
import java.util.Scanner;

public class Proposto_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * Math.pow(raio, 2);
        System.out.printf("A área é igual a %.4f", area);
        sc.close();
    }
}
