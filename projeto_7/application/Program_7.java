package projeto_7.application;

import projeto_7.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digite seu nome: ");
        sc.nextLine();
        String nomeUsuario = sc.nextLine();
        System.out.print("Há algum depósito inicial? [S/N] ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Quanto? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroDaConta, nomeUsuario, depositoInicial);
        } else {
            conta = new Conta(numeroDaConta, nomeUsuario);
        }
        System.out.println();

        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Digite um valor para depositar: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println();

        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Digite um valor para sacar: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println();

        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        sc.close();
    }
}
