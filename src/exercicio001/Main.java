package exercicio001;

public class Main {
    public static void main(String[] args) {
        try {
            Estudante estudante = new Estudante("Paulo", 5, 7.3, 7.8, 7.0);

            // Imprime as informações do estudante
            System.out.println("Nome: " + estudante.nome);
            System.out.println("Matricula: " + estudante.matricula);
            System.out.println("1º Nota: " + estudante.getNota1());
            System.out.println("2º Nota: " + estudante.getNota2());
            System.out.println("3º Nota: " + estudante.getNota3());
            System.out.printf("Média final: %.1f%n", estudante.getMedia());

            // Verifica se o estudante foi aprovado
            if (estudante.isAprovado()) {
                System.out.printf("O aluno %s foi aprovado.%n", estudante.nome);
            } else {
                System.out.printf("O aluno %s foi reprovado.%n", estudante.nome);
            }

        } catch (NotaInvalidaException e) {
            // Trata a exceção lançada caso uma nota inválida seja passada
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
