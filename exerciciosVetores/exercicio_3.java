package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        double soma = 0;
        double menorQueDezesseis = 0;

        for (int i = 0; i < n ; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if (idades[i] < 16){
                menorQueDezesseis += 1;
            }
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            soma += alturas[i];
        }
        System.out.println();

        double alturaMedia = soma / n;
        System.out.printf("Altura média = %.2f\n", alturaMedia);

        double pessoasMenoresDeDezesseis = (menorQueDezesseis / n * 100);
        System.out.printf("Pessoas com menos de 16 anos: %.1f por cento\n", pessoasMenoresDeDezesseis);
        for (int i = 0; i < n; i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        System.out.println();

        sc.close();
    }
}
