package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RepositorioRestaurante extends CrudRepository<Prato, Integer> {
     List<Prato> findAll();
    
}