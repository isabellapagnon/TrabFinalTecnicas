package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoConsultaPedido {
    private RepositorioPedido repositorioPedido;
    private PoliticaCustoTotal politicaCustoTotal;
    private Pedidos ped;

    @Autowired
    public ServicoConsultaPedido(RepositorioPedido repositorioPedido, PoliticaCustoTotal politicaCustoTotal) {
        this.repositorioPedido = repositorioPedido;
        this.politicaCustoTotal = politicaCustoTotal;
    }

    public Pedidos getDadosPedido(int numeroPedido) {
        List<Pedidos> pedidos = repositorioPedido.findByNumeroPedido(numeroPedido);
        if (pedidos.isEmpty()) {
            throw new IllegalArgumentException("Pedido nao encontrado");
        } else {
            ped = pedidos.get(0);
        }
        return ped;

    }
}