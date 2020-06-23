package com.grupo13.trabalhoFinalTecnicas.Entidades;

import java.util.List;

public class Pedidos {
    private int numeroPedido;
    private List<Prato> pratos;
    private double precoPratos;
    private double precoFrete;
    private String nomeCliente;
    private String rua;
    private String numero;
    private String bairro;
    private FormasPagamento formasPagamento;

    public Pedidos(int numeroPedido, List<Prato> pratos, double precoPratos, double precoFrete, String nomeClient,
            String rua, String numero, String bairro, FormasPagamento formasPagamento) {
        this.numeroPedido = numeroPedido;
        this.pratos = pratos;
        this.precoPratos = precoPratos;
        this.precoFrete = precoFrete;
        this.nomeCliente = nomeClient;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.formasPagamento = formasPagamento;

    }

    public static Pedidos createNewPedido(int numeroPedido, String nomeCliente, String rua, String numero, String bairro, FormasPagamento formasPagamento){
        return new Pedidos(numeroPedido, null, 0.0, 0.0, nomeCliente, rua, numero, bairro, formasPagamento);
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        if (numeroPedido < 0.0) {
            throw new IllegalArgumentException("Número inválido");
        } else {
            this.numeroPedido = numeroPedido;
        }
    }
    
    public List<Prato> getPratos(){
        return pratos;
    }

    public void addPrato(Prato prato){
        pratos.add(prato);
    }

    public double getPrecoPratos(){
        return precoPratos;
    }

    public double getPrecoFrete(){
        return precoFrete;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public String getRua(){
        return rua;
    }

    public String getNumero(){
        return numero;
    }

    public String getBairro(){
        return bairro;
    }

    public Enum<FormasPagamento> getFormasPagamento() {
        return formasPagamento;
    }


}
