package exercicio008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        String cargo;
        double salario;
        double porcentagem;

        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        // Entradas para nome, cargo e salário inicial
        System.out.print("Digite o nome do funcionario: ");
        nome = input.nextLine();
        System.out.print("Digite o cargo do funcionario: ");
        cargo = input.nextLine();
        System.out.print("Digite o salário inicial do funcionario: R$ ");
        salario = input.nextDouble();

        // Atribuindo os valores aos atributos da Classe Funcionario.
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);

        // Exibe nome, cargo e salário do funcionário.
        System.out.println("\nNome do funcionario: " + funcionario.getNome());
        System.out.println("Cargo do funcionario: " + funcionario.getCargo());
        System.out.printf("Salario do funcionario: R$ %.2f", funcionario.getSalario());

        System.out.print("\nDigite em %(porcentagem) quanto que voce ira aumentar o salario de " + funcionario.getNome()
        + ": ");
        porcentagem = input.nextDouble();
        funcionario.aumento(porcentagem);

        System.out.printf("O salario novo com %.1f%% de aumento: R$ %.2f", porcentagem, funcionario.getSalario());
    }
}
