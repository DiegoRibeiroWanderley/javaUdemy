package exerciciosIniciantes.exercicios_2;
import java.util.Scanner;

public class Proposto_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtde = sc.nextInt();
        double preco;
        if (codigo == 1){
            preco = 4.00;
        }else if (codigo == 2){
            preco = 4.50;
        }else if(codigo == 3){
            preco = 5.00;
        }else if(codigo == 4){
            preco = 2.00;
        }else{
            preco = 1.50;
        }
        System.out.printf("Total: R$ %.2f", preco * qtde);
        sc.close();
    }
}
