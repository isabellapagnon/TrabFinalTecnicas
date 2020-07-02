package com.grupo13.trabalhoFinalTecnicas.Interfaces;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @PostMapping(value = "/criaPrato/{nome}/{preco}/{quantidade}")
    public Prato createPrato(@PathVariable String nome, @PathVariable Double preco, @PathVariable int quantidade){
        return new Prato(nome, preco, quantidade);
    }
}
