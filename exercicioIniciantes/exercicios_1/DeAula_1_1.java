package exerciciosIniciantes.exercicios_1;

import java.util.Locale;

public class DeAula_1_1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é R$ %.2f\n", produto1, preco1);
        System.out.printf("%s, cujo preço é R$ %.2f\n", produto2, preco2);
        System.out.printf("Record: %d anos, código %d e gênero: %s\n", age, code, gender);
        System.out.printf("Medida com oito pontos decimais: %.8f\n", medida);
        System.out.printf("Com três pontos decimais: %.3f\n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal do US: %.3f", medida);
    }
}
