package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Servicos;

import java.util.List;

import com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Respositorios.RepositorioPedido;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoConsultaPedido {
    
    private RepositorioPedido repositorioPedido;
    private Pedidos ped;

    @Autowired
    public ServicoConsultaPedido(RepositorioPedido repositorioPedido) {
        this.repositorioPedido = repositorioPedido;
    }

    public Pedidos getDadosPedido(int id) {
        List<Pedidos> pedidos = repositorioPedido.findById(id);
        if (pedidos.isEmpty()) {
            throw new IllegalArgumentException("Pedido nao encontrado");
        } else {
            ped = pedidos.get(0);
        }
        return ped;

    }
}