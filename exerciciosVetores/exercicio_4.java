package exerciciosVetores;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < n; i++){
            if (numeros[i] % 2 == 0){
                System.out.printf("%d ", numeros[i]);
            }
        }

        sc.close();
    }
}
