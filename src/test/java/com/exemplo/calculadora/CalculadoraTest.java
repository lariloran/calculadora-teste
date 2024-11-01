package com.exemplo.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testAdicao() {
        assertEquals(7, calculadora.adicao(3, 4));
    }

    @Test
    void testSubtracao() {
        assertEquals(1, calculadora.subtracao(5, 4));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(20, calculadora.multiplicacao(5, 4));
    }

    @Test
    void testDivisao() {
        assertEquals(2.5, calculadora.divisao(5, 2));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(5, 0));
    }

    @Test
    void testPotenciaAoQuadrado() {
        assertEquals(25, calculadora.potenciaAoQuadrado(5));
    }

    @Test
    void testRestoDivisao() {
        assertEquals(1, calculadora.restoDivisao(5, 2));
    }
}
