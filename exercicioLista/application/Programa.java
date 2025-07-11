package exercicioLista.application;

import exercicioLista.entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> empregados = new ArrayList<>();

        System.out.print("Quantos empregados vão ser registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Empregado %d\n", i + 1);
            System.out.print("ID: ");
            sc.nextLine();
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            empregados.add(new Empregado(id, nome, salario));
        }
        System.out.println();

        System.out.print("Insira o ID do funcionário que deseja aumentar o salário: ");
        int id = sc.nextInt();
        Empregado escolhido = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (escolhido == null){
            System.out.println("Este ID não existe!");
        }else{
            System.out.print("Em quantos por cento? ");
            double porcentagem = sc.nextDouble();
            escolhido.aumentarSalario(porcentagem);
        }
        System.out.println();

        System.out.println("Lista de funcionários:");
        for (Empregado empregado : empregados){
            System.out.println(empregado);
        }

        sc.close();
    }
}
