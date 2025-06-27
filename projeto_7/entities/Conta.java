package projeto_7.entities;

public class Conta {
    private final int numeroDaConta;
    private String nomeUsuario;
    private double saldo;

    public Conta(int numeroDaConta, String nomeUsuario) {
        this.numeroDaConta = numeroDaConta;
        this.nomeUsuario = nomeUsuario;
    }

    public Conta(int numeroDaConta, String nomeUsuario, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeUsuario = nomeUsuario;
        deposito(depositoInicial);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double dinheiro){
        saldo += dinheiro;
    }

    public void saque(double dinheiro){
        saldo -= dinheiro + 5;
    }

    public String toString() {
        return "Conta: "
                + numeroDaConta
                + ", Titular: "
                + nomeUsuario
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}

