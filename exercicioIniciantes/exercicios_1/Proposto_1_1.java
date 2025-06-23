package exerciciosIniciantes.exercicios_1;
import java.util.Scanner;

public class Proposto_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.printf("SOMA = %d", soma);
        sc.close();
    }
}
