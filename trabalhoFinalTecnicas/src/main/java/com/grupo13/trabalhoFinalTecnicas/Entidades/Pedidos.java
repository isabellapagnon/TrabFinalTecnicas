package com.grupo13.trabalhoFinalTecnicas.Entidades;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// import java.text.Normalizer.Form;
import java.util.List;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroPedido;
    @ElementCollection(targetClass=Prato.class)
    private List<Prato> pratos;
    private double precoPratos;
    private final double precoFrete = 15;
    private String nomeCliente;
    private String rua;
    private String numero;
    private String bairro;
    private FormasPagamento formasPagamento;

    public Pedidos(List<Prato> pratos, double precoPratos, double precoFrete, String nomeClient,
            String rua, String numero, String bairro, FormasPagamento formasPagamento) {
        this.pratos = pratos;
        this.precoPratos = precoPratos;
        this.nomeCliente = nomeClient;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.formasPagamento = formasPagamento;

    }

    public static Pedidos createNewPedido(String nomeCliente, String rua, String numero, String bairro, FormasPagamento formasPagamento){
        return new Pedidos( null, 0.0, 0.0, nomeCliente, rua, numero, bairro, formasPagamento);
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }
    
    public List<Prato> getPratos(){
        return pratos;
    }

    public void addPrato(Prato prato){
        if (pratos.isEmpty()) {
            pratos.add(prato);
        } else {
            for (int i = 0; i < pratos.size(); i++) {
                if (prato.getNome().equals(pratos.get(i).getNome())) {
                    pratos.get(i).setQuantidade(prato.getQuantidade());
                }
                else {
                    pratos.add(prato);
                }
            }
        }
    }

    public double getPrecoPratos(){
        double total = 0;
        for (int i = 0; i < pratos.size(); i++) {
            total = total + pratos.get(i).getPreco();
        }
        this.precoPratos = total;
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
