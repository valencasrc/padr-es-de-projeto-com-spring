package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraFacade {

    @Autowired
    private CalculadoraService calculadoraService;

    public double somar(double a, double b) {
        return calculadoraService.calcular(a, b, new Soma());
    }

    public double subtrair(double a, double b) {
        return calculadoraService.calcular(a, b, new Subtracao());
    }
}
