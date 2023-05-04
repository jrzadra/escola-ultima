package com.ultimaschool.pessoas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    Estudante estudante1;
    Estudante estudante2;
    Estudante estudante3;

    @BeforeEach
    void setUp() {
        estudante1 = new Estudante("João Antonio",'M');
        estudante2 = new Estudante("Camila Mendes", 'F');
        estudante3 = new Estudante("Fabricio Peixoto", 'M');
    }


    @Test
    void getMatricula() {
        estudante1.getMatricula();
        estudante2.getMatricula();
        estudante3.getMatricula();
        Assertions.assertNull(estudante1.getMatricula());
        Assertions.assertNull(estudante2.getMatricula());
        Assertions.assertNull(estudante3.getMatricula());
    }

    @Test
    void setMatricula() {

    }

    @Test
    void getNotas() {
    }

    @Test
    void setNotas() {
    }

    @Test
    void consolidarNota() {
    }

    @Test
    void calcularMediaFinal() {
    }

    @Test
    void verSituacao() {
    }

    @Test
    void relatorio() {
    }

    @AfterEach
    void tearDown() {
    }
}