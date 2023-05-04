package com.ultimaschool.pessoas;

import org.junit.jupiter.api.*;

class ResponsavelTest {

    Responsavel responsavel1;
    Responsavel responsavel2;
    Responsavel responsavel3;

    @BeforeEach
    void setUp() {

        responsavel1 = new Responsavel("Carlos Moreira",'M');
        responsavel2 = new Responsavel("Amanda Castro",'F');
        responsavel3 = new Responsavel("Jonas Fagundes",'M');
    }

    @Test
    void testGetPagamentos() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());

        responsavel1.pagarMensalidade(1, true);
        responsavel2.pagarMensalidade(2, false);
        responsavel3.pagarMensalidade(3, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[1],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[2],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3],true);

        responsavel1.pagarMensalidade(4, true);
        responsavel2.pagarMensalidade(5, false);
        responsavel3.pagarMensalidade(6, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[4],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[5],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6],true);

        responsavel1.pagarMensalidade(7, true);
        responsavel2.pagarMensalidade(8, false);
        responsavel3.pagarMensalidade(9, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[7],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[8],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[9],true);

        responsavel1.pagarMensalidade(10, true);
        responsavel2.pagarMensalidade(11, false);
        responsavel3.pagarMensalidade(12, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[10],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[11],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[12],true);

    }

    @Test
    void testSetPagamentos() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());

        responsavel1.pagarMensalidade(1, true);
        responsavel2.pagarMensalidade(2, false);
        responsavel3.pagarMensalidade(3, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[1],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[2],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3],true);

        responsavel1.pagarMensalidade(4, true);
        responsavel2.pagarMensalidade(5, false);
        responsavel3.pagarMensalidade(6, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[4],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[5],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6],true);

        responsavel1.pagarMensalidade(7, true);
        responsavel2.pagarMensalidade(8, false);
        responsavel3.pagarMensalidade(9, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[7],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[8],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[9],true);

        responsavel1.pagarMensalidade(10, true);
        responsavel2.pagarMensalidade(11, false);
        responsavel3.pagarMensalidade(12, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[10],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[11],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[12],true);
    }

    @Test
    void testPagarMensalidade() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());

        responsavel1.pagarMensalidade(1, true);
        responsavel2.pagarMensalidade(2, false);
        responsavel3.pagarMensalidade(3, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[1],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[2],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3],true);

        responsavel1.pagarMensalidade(4, true);
        responsavel2.pagarMensalidade(5, false);
        responsavel3.pagarMensalidade(6, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[4],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[5],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6],true);

        responsavel1.pagarMensalidade(7, true);
        responsavel2.pagarMensalidade(8, false);
        responsavel3.pagarMensalidade(9, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[7],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[8],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[9],true);

        responsavel1.pagarMensalidade(10, true);
        responsavel2.pagarMensalidade(11, false);
        responsavel3.pagarMensalidade(12, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[10],true);
        Assertions.assertEquals(responsavel2.getPagamentos()[11],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[12],true);
    }

    @Test
    void testVerSituacao() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());
        responsavel1.verSituacao(1);
        responsavel2.verSituacao(2);
        responsavel3.verSituacao(3);
        Assertions.assertEquals(responsavel1.getPagamentos()[1],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[2],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3],false);

        responsavel1.verSituacao(4);
        responsavel2.verSituacao(5);
        responsavel3.verSituacao(6);
        Assertions.assertEquals(responsavel1.getPagamentos()[4],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[5],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6],false);

        responsavel1.verSituacao(7);
        responsavel2.verSituacao(8);
        responsavel3.verSituacao(9);
        Assertions.assertEquals(responsavel1.getPagamentos()[7],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[8],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[9],false);

        responsavel1.verSituacao(10);
        responsavel2.verSituacao(11);
        responsavel3.verSituacao(12);
        Assertions.assertEquals(responsavel1.getPagamentos()[10],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[11],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[12],false);
    }

    @Test
    void testRelatorio() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());

        responsavel1.relatorio();
        responsavel2.relatorio();
        responsavel3.relatorio();
        Assertions.assertEquals(responsavel1.getPagamentos()[1],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[2],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3],false);

        Assertions.assertEquals(responsavel1.getPagamentos()[4],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[5],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6],false);

        Assertions.assertEquals(responsavel1.getPagamentos()[7],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[8],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[9],false);

        Assertions.assertEquals(responsavel1.getPagamentos()[10],false);
        Assertions.assertEquals(responsavel2.getPagamentos()[11],false);
        Assertions.assertEquals(responsavel3.getPagamentos()[12],false);

    }

    @AfterEach
    void tearDown() {
        responsavel1 = null;
        responsavel2 = null;
        responsavel3 = null;
    }
}
