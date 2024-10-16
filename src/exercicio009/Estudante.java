package exercicio009;

import java.time.LocalDate;
import java.time.Period;

public class Estudante {
    private int matricula;
    private String nome;
    private int ano;
    private int mes;
    private int dia;


    public Estudante(int matricula, String nome, int ano, int mes, int dia) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        return Period.between(dataNascimento, hoje).getYears();
    }
}