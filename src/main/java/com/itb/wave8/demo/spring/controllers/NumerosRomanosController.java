package com.itb.wave8.demo.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class NumerosRomanosController {
    
    @GetMapping("/convertirANumeroRomano/{numero}")
    public String convertirANumeroRomano(@PathVariable Integer numero){
        return "El numero ingresado fue " + numero;
    }
}
