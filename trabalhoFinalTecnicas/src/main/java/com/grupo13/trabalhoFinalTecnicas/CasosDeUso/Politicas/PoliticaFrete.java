package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Politicas;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

public class PoliticaFrete{
    public boolean freteGratis(Pedidos pedido) {
        if (pedido.getPrecoPratos() > 50 && pedido.getPrecoPratos() < 100) {
            return true;
        }
        return false;
    }
}