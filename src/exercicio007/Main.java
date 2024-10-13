package exercicio007;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.print("Digite um nickname do jogador: ");
        String nome = input.nextLine();
        jogador.setNome(nome);

        System.out.println("Sistema de pontuação: C, B, A, S.");
        System.out.println("Ate 4 eh nivel C.");
        System.out.println("De 5 a 7 eh nivel B.");
        System.out.println("De 8 a 9 eh nivel A.");
        System.out.println("10 pontos ou mais eh nivel S.");

        System.out.printf("\nNome: %s", jogador.getNome());
        System.out.printf("\nPontos: %d", jogador.getPontos());
        System.out.printf("\nnivel: %s%n", jogador.getNivel());

        System.out.println("Adicionando 10 pontos ao jogador e mudando automaticamente o nivel.");
        jogador.addPontos(10);

        System.out.printf("\nNome: %s", jogador.getNome());
        System.out.printf("\nPontos: %d", jogador.getPontos());
        System.out.printf("\nnivel: %s%n", jogador.getNivel());

        System.out.println("Removendo 3 pontos do jogador e mudando novamente o nivel.");
        jogador.rmPontos(3);

        System.out.printf("\nNome: %s", jogador.getNome());
        System.out.printf("\nPontos: %d", jogador.getPontos());
        System.out.printf("\nnivel: %s%n", jogador.getNivel());
    }
}
