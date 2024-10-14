package exercicio003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite um nome para a Pessoa: ");
        String oNome = input.nextLine();

        System.out.print("Digite a idade: ");
        int aIdade = input.nextInt();

        // Consumir a nova linha após o nextInt();.
        input.nextLine();

        System.out.print("Digite o endereco: ");
        String oEndereco = input.nextLine();

        pessoa.setPessoa(aIdade, oEndereco, oNome);

        System.out.printf("%s tem %d anos de idade e mora no endereco: %s.", pessoa.getNome(), pessoa.getIdade(),
        pessoa.getEndereco());
    }
}
