package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;

public class Proposto_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
