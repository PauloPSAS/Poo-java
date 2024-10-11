public class Pessoa {
    private int idade;
    private String endereco;
    private String nome;

    public void setPessoa(int idade, String endereco, String nome) {
        this.idade = idade;
        this.endereco = endereco;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }
}
