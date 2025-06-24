package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;

public class Proposto_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int horas;
        if (num1 > num2 || num1 == num2){
            horas = 24 - num1 + num2;
        }else{
            horas = num2 - num1;
        }
        System.out.printf("O jogo durou %d hora(s)", horas);
        sc.close();
    }
}
