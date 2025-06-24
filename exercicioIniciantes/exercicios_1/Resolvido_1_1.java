package exerciciosIniciantes.exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_1_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, valor, area, preco;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valor = sc.nextDouble();
        area = largura * comprimento;
        preco = area * valor;
        System.out.printf("Área = %.2f\n", area);
        System.out.printf("Preço = %.2f\n", preco);
        sc.close();
    }
}
