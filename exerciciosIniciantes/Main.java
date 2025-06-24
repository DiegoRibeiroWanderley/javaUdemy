package exerciciosIniciantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        int higher = max(num_1, num_2, num_3);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.printf("Higher = %d", value);
    }
}