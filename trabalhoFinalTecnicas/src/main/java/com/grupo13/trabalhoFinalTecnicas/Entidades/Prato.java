package com.grupo13.trabalhoFinalTecnicas.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prato {
    @Id
    private int id;
    @Column(unique=true)
    private String nomePrato;
    private double preco;
    private int quantidade;

    public Prato(int id, String nomePrato, double preco, int quantidade) {
        this.id = id;
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static Prato criaNovoPrato(int pratoID, String nomePrato, double preco, int quantidade) {
        if(preco < 0.0){
            throw new IllegalArgumentException("Preço inválido");
        }
        if(nomePrato == null){
            throw new IllegalArgumentException("Nome do Prato inválido");
        }
        return new Prato(pratoID, nomePrato, preco, quantidade);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quant) {
        quantidade = quantidade + quant;
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if (preco < 0.0) {
            throw new IllegalArgumentException("Preço inválido");
        } else {
            this.preco = preco;
        }
    }

}