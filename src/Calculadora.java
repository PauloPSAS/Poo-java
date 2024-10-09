// Classe Calculadora
public class Calculadora {

    // Método principal main.
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double soma = calc.somar(10, 5);
        double subtracao = calc.subtrair(10, 5);
        double multiplicacao = calc.multiplicar(10, 5);
        double divisao = calc.dividir(10, 5);
        double excessao = 0;

        System.out.println("Soma 10 + 5 = " + soma);
        System.out.println("Subtracao 10 - 5 = " + subtracao);
        System.out.println("Multiplicacao 10 x 5 = " + multiplicacao);
        System.out.println("Divisao 10 / 5 = " + divisao);

        // Tentativa de divisão por 0 Tratada.
        try {
            excessao = calc.dividir(10, 0);
        } catch (IllegalArgumentException excep){
            System.out.println("Erro: " + excep.getMessage());
        }

        System.out.println("Divisao por 0:  10 / 0 = " + excessao);
    }

    // Método para somar dois números.
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números.
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números.
    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao e permitida.");
    } else {
        return a / b;
        }
    }
}
