package projeto_3.application;

import projeto_3.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAl = %.2f\n", rectangle.diagonal());

        sc.close();
    }
}
