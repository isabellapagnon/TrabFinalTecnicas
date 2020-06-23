package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import java.util.List;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Restaurante;

public class ServicoRestaurante {
    private List<Prato> pratos;
    private Restaurante restaurante;

    public String listarPratos(){
        return restaurante.getPratos().toString();
    }
}