package exerciciosIniciantes.exercicios_4;

import java.util.Locale;
import java.util.Scanner;

public class Proposto_4_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = sc.nextInt();
        double resultado;
        for (int i = 0; i < cont; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            if (num2 == 0){
                System.out.println("impossível de calcular");
            }else {
                resultado = num1 / num2;
                System.out.println(resultado);
            }
        }

        sc.close();
    }
}
