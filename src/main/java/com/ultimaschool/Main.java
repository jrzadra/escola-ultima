package com.ultimaschool;

import com.ultimaschool.pessoas.Estudante;
import com.ultimaschool.pessoas.Responsavel;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Carlos Eduardo Moreira");


        estudante.consolidarNota(1,6.0);
        estudante.consolidarNota(2,8.5);
        estudante.consolidarNota(3,7.5);
        estudante.consolidarNota(4,9.0);

        System.out.println(estudante.relatorio());
        System.out.println(estudante.verSituacao(3));

        Responsavel responsavel = new Responsavel("Guilherme Moreira");
        responsavel.pagarMensalidade(1,true);
        responsavel.pagarMensalidade(2,true);
        responsavel.pagarMensalidade(3,false);
        responsavel.pagarMensalidade(4,true);
        responsavel.pagarMensalidade(5,false);
        responsavel.pagarMensalidade(6,true);

        System.out.println(responsavel.relatorio());
        System.out.println(responsavel.verSituacao(2));
        System.out.println(responsavel.verSituacao(5));

    }
}