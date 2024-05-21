package com.example.controller;

import com.example.service.CalculadoraFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraFacade calculadoraFacade;

    @GetMapping("/somar/{a}/{b}")
    public double somar(@PathVariable double a, @PathVariable double b) {
        return calculadoraFacade.somar(a, b);
    }

    @GetMapping("/subtrair/{a}/{b}")
    public double subtrair(@PathVariable double a, @PathVariable double b) {
        return calculadoraFacade.subtrair(a, b);
    }
}
