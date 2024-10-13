package exercicio007;

public class Jogador {

    // Atributos do jogador.
    private String nome; // Atributo para armazenar o nome do jogador.
    private int pontos = 0; // Atributo para armazenar os pontos do jogador.
    private char nivel = 'C'; // Atributo para armazenar o nivel atual do jogador.

    // Método para adicionar o nome ao atributo "nome".
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para retornar o nome.
    public String getNome() {
        return nome;
    }

    // Método para retornar os pontos.
    public int getPontos() {
        return pontos;
    }

    // Método para retornar o nível.
    public char getNivel() {
        return nivel;
    }

    // Método para adicionar pontos.
    public void addPontos(int pontos) {
        this.pontos += pontos;
        defineNivel();
    }

    // Método para remover pontos.
    public void rmPontos(int pontos) {
        this.pontos -= pontos;
        defineNivel();
    }

    // método para determinar o nivel do jogador pela quantidade de pontos.
    private void defineNivel() {
        if (pontos >= 5 && pontos <= 7) { // Intervalo de 5 a 7
            nivel = 'B';
        } else if (pontos >= 8 && pontos <= 9) { // Intervalo de 8 a 9
            nivel = 'A';
        } else if (pontos >= 10) { // Exatamente 10
            nivel = 'S';
        }
    }

}