package com.example.config;

import com.example.model.Operacao;
import com.example.model.Soma;
import com.example.model.Subtracao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CalculadoraConfig {

    @Bean
    public Map<String, Operacao> operacoes() {
        Map<String, Operacao> operacoes = new HashMap<>();
        operacoes.put("soma", new Soma());
        operacoes.put("subtracao", new Subtracao());
        return operacoes;
    }
}