package com.grupo13.trabalhoFinalTecnicas.Entidades;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Restaurante {
    private String nome;
    private String especialidade;
    private List<Prato> pratos;

    public Restaurante(String nome, String especialidade, List<Prato> pratos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.pratos = pratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public List<Prato> getPratos(){
        return pratos;
    }

    public void addPrato(Prato p){
        pratos.add(p);
    }
}