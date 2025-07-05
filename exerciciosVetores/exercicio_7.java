package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        double soma = 0;
        double media;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        media = soma / n;

        System.out.println();
        System.out.printf("Média do vetor = %.3f\n", media);

        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < n; i++){
            if (numeros[i] < media){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
