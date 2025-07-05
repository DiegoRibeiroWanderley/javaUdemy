package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        double mediaAlturaF, somaAlturaF = 0;
        int contF = 0, contM = 0;

        for (int i = 0; i < n; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if (genero[i] == 'f' || genero[i] == 'F'){
                somaAlturaF += altura[i];
                contF += 1;
            }else{
                contM += 1;
            }
        }

        mediaAlturaF = somaAlturaF / contF;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturaF);
        System.out.printf("Numero de homens = %d\n", contM);

        sc.close();
    }
}