package exercicioLista.entities;

public class Empregado {
    private int id;
    private String nome;
    private double salario;

    public Empregado(){}

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * (porcentagem / 100);
    }

    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
