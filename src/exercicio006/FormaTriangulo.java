package exercicio006;

public class FormaTriangulo {
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
}
