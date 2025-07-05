package exerciciosVetores;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        double media = soma / n;

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

            sc.close();
    }
}
