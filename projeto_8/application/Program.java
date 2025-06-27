package projeto_8.application;

import projeto_8.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Product(nome, preco);
        }

        double soma = 0;
        for (Product product : vect) {
            soma += product.getPreco();
        }
        double media = soma / vect.length;

        System.out.printf("Preço médio = %.2f\n", media);

        sc.close();
    }
}


