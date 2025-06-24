package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;

public class Proposto_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}
