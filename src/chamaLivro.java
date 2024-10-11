public class chamaLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setLivro("Shows e misterios", "Mister mister", 78.45);

        System.out.println("Titulo do livro: " + livro.getTitulo());
        System.out.println("Autor do livro: " + livro.getAutor());
        System.out.printf("Valor do livro: R$ %.2f\n", livro.getPreco());
    }
}
