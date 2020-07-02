package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Politicas;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

public class PoliticaPedidoMaximo {

    public void verificarPedidoMaximo(Pedidos pedido) {
        for (int i = 0; i < pedido.getPratos().size(); i++) {
            if (pedido.getPratos().get(i).getQuantidade() > 5) {
                throw new IllegalArgumentException("Só é possível pedir 5 unidades de cada prato!");
            }
        }
    }   
}