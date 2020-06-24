package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

public interface RepositorioRestaurante {
     List<Prato> findAllPratos();
    
}