package exercicio006;//biblioteca para digitar os valores dos lados pelo teclado.
import java.util.Scanner;

public class Triangulo {

    // metodo principal.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FormaTriangulo triangulo = new FormaTriangulo();

        System.out.print("Digite o tamanho do lado A: ");
        double a = input.nextDouble();
        System.out.print("Digite o tamanho do lado B: ");
        double b = input.nextDouble();
        System.out.print("Digite o tamanho do lado C: ");
        double c = input.nextDouble();

        triangulo.setLados(a, b, c);

        if (triangulo.ii())
            System.out.printf("O triangulo de lados %.1f x %.1f x %.1f eh valido e ele eh %s\n", triangulo.getLadoA(),
            triangulo.getLadoB(), triangulo.getLadoC(), triangulo.i());
        else
            System.out.printf("O valores %.1f x %.1f x %.1f não tornam o triangulo valido.", triangulo.getLadoA(),
            triangulo.getLadoB(), triangulo.getLadoC());
    }
}
