package exercicio005;
public class ContaCorrente {
    public static void main(String[] args) {

        AcoesConta contaCorrente = new AcoesConta();

        contaCorrente.setDadosDaConta(200045, 1400.00, "Paulo Souza");

        System.out.println("O numero da conta é: " + contaCorrente.getNumeraDaConta());
        System.out.printf("O titular da conta é %s.\n", contaCorrente.getTitulaDaConta());
        System.out.printf("Seu saldo atual é: R$ %.2f\n", contaCorrente.getSaldoDaConta());
        System.out.println("Modificando agora o saldo da conta...");
        System.out.println("Sacando R$ 400,00 da conta.");
        contaCorrente.saque(400.00);
        System.out.printf("Agora o saldo é de: R$ %.2f\n", contaCorrente.getSaldoDaConta());
        System.out.println("Depositando R$ 1000,00 na conta.");
        contaCorrente.deposito(1000.00);
        System.out.printf("Agora o saldo é de: R$ %.2f\n", contaCorrente.getSaldoDaConta());
    }
}