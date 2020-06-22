package com.grupo13.trabalhoFinalTecnicas.Entidades;

public class Prato {
    private String nomePrato;
    private double preco;

    public Prato(String nomePrato, double preco) {
        this.nomePrato = nomePrato;
        this.preco = preco;
    }

    public static Prato criaNovoPrato(String nomePrato, double preco) {
        if(preco < 0.0){
            throw new IllegalArgumentException("Preço inválido");
        }
        if(nomePrato == null){
            throw new IllegalArgumentException("Nome do Prato inválido");
        }
        return new Prato(nomePrato, preco);
    }

    public String getNome() {
        return nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0.0) {
            throw new IllegalArgumentException("Preço inválido");
        } else {
            this.preco = preco;
        }
    }

}