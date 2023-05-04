package com.ultimaschool.pessoas;

public class Estudante extends Pessoa {

    final int UNIDADE = 4;
    private String matricula;
    private double[] notas = new double[UNIDADE];

    public Estudante(String nome, char genero) {
        super(nome, genero);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void consolidarNota(int unidade, double nota) {

        notas[unidade-1] = nota;
    }
    public double calcularMediaFinal() {
        double somaDasNotas = 0.0;
        for(double nota : notas) {
            somaDasNotas+= nota;
        }
        return somaDasNotas / UNIDADE;
    }

    private int definirUnidadeApartirDoMes(int mes) {
        if (mes >= 1 && mes <= 3) {
            return 1;
        } else if (mes > 3 && mes <= 6) {
            return 2;
        } else if (mes > 6 && mes <= 9) {
            return 3;
        } else if (mes > 9 && mes <= 12) {
            return 4;
        } else {
            return 0;
        }
    }
    @Override
    public String verSituacao(int mes) {
        int unidade = definirUnidadeApartirDoMes(mes);
        if (getNotas()[unidade-1] >= 7.0) {
            return "O aluno está na média, na unidade " + unidade +
                    " e obteve a nota " + getNotas()[unidade-1];
        }
        return "O aluno não está na média, na unidade " + unidade +
                " e obteve a nota " + getNotas()[unidade-1];
    }

    @Override
    public String relatorio() {

        return "O estudante " + getNome() + " , obteve a média final de "
                + calcularMediaFinal();
    }
}
