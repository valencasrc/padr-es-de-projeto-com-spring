package com.example.model;

public class Subtracao implements Operacao {

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}