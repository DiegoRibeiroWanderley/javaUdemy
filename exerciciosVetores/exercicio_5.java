package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maiorNumero = 0;
        int posicaoMaiorValor = 0;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            if (i == 0){
                maiorNumero = numeros[i];
            }else{
                if (numeros[i] > maiorNumero){
                    maiorNumero = numeros[i];
                    posicaoMaiorValor = i;
                }
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %f\n", maiorNumero);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", posicaoMaiorValor);

        sc.close();
    }
}
