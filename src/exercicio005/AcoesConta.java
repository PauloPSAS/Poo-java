package exercicio005;

public class AcoesConta {
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

        public int getNumeraDaConta() {
            return numeraDaConta;
        }

        public double getSaldoDaConta() {
            return saldoDaConta;
        }

        public String getTitulaDaConta() {
            return titulaDaConta;
        }
    }
