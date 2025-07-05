package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        int contPares = 0;
        double soma = 0, media;

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            if (numeros[i] % 2 == 0){
                soma += numeros[i];
                contPares += 1;
            }
        }

        media = soma / contPares;

        if (soma == 0){
            System.out.println("Sem números pares");
        }else{
            System.out.printf("Média dos pares: %.1f", media);
        }
        sc.close();
    }
}
