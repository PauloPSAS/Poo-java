package exercicio009;

public class Main {

    public static void main(String[] args) {
        Estudante aluno1 = new Estudante(1, "Rose", 2006, 1, 26);
        Estudante aluno2 =  new Estudante(2, "Júlia", 2001, 12, 15);
        Estudante aluno3 = new Estudante(3, "Paulo", 1997, 9, 30);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());
        System.out.println();
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getIdade());
        System.out.println();
        System.out.println(aluno3.getNome());
        System.out.println(aluno3.getIdade());
    }
}