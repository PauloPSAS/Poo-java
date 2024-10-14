package exercicio008;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Método para definir um nome ao funcionário.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para definir o cargo do funcionário.
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para definir o salário do funcionário.
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para mostrar o nome do funcionário.
    public String getNome() {
        return nome;
    }

    // Método para mostrar o cargo do funcionário.
    public String getCargo() {
        return cargo;
    }

    // Método para mostrar o salário do funcionário.
    public double getSalario() {
        return salario;
    }

    // Método para aumentar o salário do funcionário de acordo com a porcentagem.
    public void aumento(double pct) {
        this.salario += (this.salario / 100 * pct);
    }
}
