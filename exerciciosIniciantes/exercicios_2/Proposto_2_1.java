package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;

public class Proposto_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
