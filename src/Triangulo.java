//biblioteca para digitar os valores dos lados pelo teclado.
import java.util.Scanner;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public void setLados(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Metodo para retornar o ladoA.
    public double getLadoA() {
        return ladoA;
    }

    // Metodo para retornar o ladoB.
    public double getLadoB() {
        return ladoB;
    }

    // Metodo para retornar o ladoC.
    public double getLadoC() {
        return ladoC;
    }

    // Metodo que ira determinar o tipo do triangulo.
    public String i() {
        if (getLadoA() == getLadoB() && getLadoA() == getLadoC())
            return "EQUILATERO";
        else if (getLadoA() == getLadoB() ||
                getLadoA() == getLadoC() ||
                getLadoB() == getLadoC())
            return "ISOSCELES";
        else if (getLadoA() != getLadoB() &&
                getLadoA() != getLadoC() &&
                getLadoB() != getLadoC())
            return "ESCALENO";
        else
            return "NENHUMA OPCAO";
    }

    // Metodo para determinar se um triangulo e valido
    public Boolean ii() {
        return getLadoA() + getLadoB() > getLadoC() &&
               getLadoA() + getLadoC() > getLadoB() &&
               getLadoB() + getLadoC() > getLadoA();
    }

    // metodo principal.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

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
