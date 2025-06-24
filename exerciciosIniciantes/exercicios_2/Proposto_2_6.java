package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;
import java.util.Locale;

public class Proposto_2_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        if (valor > 0) {
            if (valor <= 25) {
                System.out.println("Intervalo [00, 25]");
            } else if (valor <= 50) {
                System.out.println("Intervalo (25, 50]");
            } else if (valor <= 75) {
                System.out.println("Intervalo (50, 75]");
            } else if (valor <= 100) {
                System.out.println("Intervalo (75, 100]");
            }else {
                System.out.println("Fora do intervalo");
            }
        }else {
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
