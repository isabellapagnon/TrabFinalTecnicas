package com.grupo13.trabalhoFinalTecnicas.Entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prato {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    
    protected Prato(){}

    public Prato(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static Prato criaNovoPrato(String nome, double preco, int quantidade) {
        if(preco < 0.0){
            throw new IllegalArgumentException("Preço inválido");
        }
        if(nome == null){
            throw new IllegalArgumentException("Nome do Prato inválido");
        }
        return new Prato(nome, preco, quantidade);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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