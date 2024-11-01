package com.exemplo.calculadora;

public class Calculadora {

    public double adicao(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public double potenciaAoQuadrado(double a) {
        return Math.pow(a, 2);
    }

    public double restoDivisao(double a, double b) {
        return a % b;
    }
}
