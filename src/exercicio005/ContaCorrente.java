package exercicio005;

public class ContaCorrente {
    private int numeraDaConta;
    private double saldoDaConta;
    private String titulaDaConta;

    public void setDadosDaConta(int numeraDeConta, double saldoDaConta, String titulaDaConta) {
        this.numeraDaConta = numeraDeConta;
        this.saldoDaConta = saldoDaConta;
        this.titulaDaConta = titulaDaConta;
    }

    public void deposito(double saldoDaConta) {
        this.saldoDaConta += saldoDaConta;
    }

    public void saque(double saldoDaConta) {
        this.saldoDaConta -= saldoDaConta;
    }

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setDadosDaConta(200045, 1400.00, "Paulo Souza");

        System.out.println("O numero da conta é: " + contaCorrente.numeraDaConta);
        System.out.printf("O titular da conta é %s.\n", contaCorrente.titulaDaConta);
        System.out.printf("Seu saldo atual é: R$ %.2f\n", contaCorrente.saldoDaConta);
        System.out.println("Modificando agora o saldo da conta...");
        System.out.println("Sacando R$ 400,00 da conta.");
        contaCorrente.saque(400.00);
        System.out.printf("Agora o saldo é de: R$ %.2f", contaCorrente.saldoDaConta);
        System.out.println("Depositando R$ 1000,00 na conta.");
        contaCorrente.deposito(1000.00);
        System.out.printf("Agora o saldo é de: R$ %.2f", contaCorrente.saldoDaConta);
    }
}
