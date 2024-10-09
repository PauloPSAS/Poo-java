public class Estudante {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    // O construtor deve declarar que pode lançar a exceção
    public Estudante(String nome, int matricula, double nota1, double nota2, double nota3) throws NotaInvalidaException {
        this.nome = nome;
        this.matricula = matricula;
        setNotas(nota1, nota2, nota3);  // Pode lançar NotaInvalidaException
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Define as notas, lançando exceção se alguma for inválida
    public final void setNotas(double nota1, double nota2, double nota3) throws NotaInvalidaException {
        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            throw new NotaInvalidaException("As notas não podem ser negativas.");
        }
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double getNota1() {
        return nota1;
    }

    double getNota2() {
        return nota2;
    }

    double getNota3() {
        return nota3;
    }

    public boolean isAprovado() {
        return getMedia() >= 7;
    }
}
