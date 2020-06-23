package com.grupo13.trabalhoFinalTecnicas.Entidades;

import java.util.List;

public class Restaurante {
    private String nome;
    private String especialidade;
    private List<Prato> pratos;

    private Restaurante(String nome, String especialidade, List<Prato> pratos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.pratos = pratos;
    }

    public List<Prato> getPratos(){
        return pratos;
    }
}