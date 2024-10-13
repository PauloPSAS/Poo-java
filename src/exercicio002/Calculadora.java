package exercicio002;

public class Calculadora {

    // Método principal main.
    public static void main(String[] args) {
        Calc calc = new Calc();

        double soma = calc.somar(10, 5);
        double subtracao = calc.subtrair(10, 5);
        double multiplicacao = calc.multiplicar(10, 5);
        double divisao = calc.dividir(10, 5);
        double excessao = 0;

        System.out.println("Soma 10 + 5 = " + soma);
        System.out.println("Subtracao 10 - 5 = " + subtracao);
        System.out.println("Multiplicacao 10 x 5 = " + multiplicacao);
        System.out.println("Divisao 10 / 5 = " + divisao);
        System.out.println("Caso tente dividir por algum valor por zero, esse erro ira aparecer: ");

        // Tentativa de divisão por 0 Tratada.
        try {
            excessao = calc.dividir(10, 0);
        } catch (IllegalArgumentException excep) {
            System.out.println("Erro: " + excep.getMessage());
        }
    }
}