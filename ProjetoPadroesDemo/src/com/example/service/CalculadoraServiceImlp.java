package com.example.service;

import com.example.model.Operacao;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public double calcular(double a, double b, Operacao operacao) {
        return operacao.calcular(a, b);
    }
}


