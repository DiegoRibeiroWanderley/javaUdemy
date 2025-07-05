package exerciciosVetores;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
