package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

public class PoliticaDesconto {

    public boolean desconto10(Pedidos pedido) {
        if (pedido.getPrecoPratos() > 100) {
            return true;
        }
        return false;
    }
    
}