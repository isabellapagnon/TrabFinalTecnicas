package com.grupo13.trabalhoFinalTecnicas.Entidades;

import java.util.List;

public class Pedidos {
    private int numeroPedido;
    private List<Prato> pratos;
    private double preçoPratos;
    private double preçoFrete;
    private String nomeCliente;
    private String rua;
    private String numero;
    private String bairro;

    private Pedidos(int numeroPedido, List<Prato> pratos, double preçoPratos, double preçoFrete, String nomeClient,
            String rua, String numero, String bairro) {

    }
}