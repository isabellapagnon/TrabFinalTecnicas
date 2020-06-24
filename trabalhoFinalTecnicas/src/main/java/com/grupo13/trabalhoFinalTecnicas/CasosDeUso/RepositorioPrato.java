package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

public interface RepositorioPrato {
    Prato findByName(String nomePrato);
    Prato findByLowestPrice();
}