package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Politicas;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;

public class PoliticaCustoTotal {
    private PoliticaDesconto politicaDesconto = new PoliticaDesconto();
    private PoliticaFrete politicaFrete = new PoliticaFrete();

    public double custoTotal(Pedidos pedido) {
        //Desconto 10% + frete grátis
        if(politicaDesconto.desconto10(pedido) && politicaFrete.freteGratis(pedido)) {
            return (pedido.getPrecoPratos() - 10/100);
        }
        //Frete gratis
        else if(!politicaDesconto.desconto10(pedido) && politicaFrete.freteGratis(pedido)) {
            return pedido.getPrecoPratos();
        }
        //Sem desconto e sem frete gratis
        return pedido.getPrecoPratos() + pedido.getPrecoFrete();

    }
    
}