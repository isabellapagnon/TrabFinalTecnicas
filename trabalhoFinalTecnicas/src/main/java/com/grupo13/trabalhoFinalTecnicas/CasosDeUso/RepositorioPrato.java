package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioPrato extends CrudRepository<Prato, String>{
    List<Prato> findByName(String nomePrato);
}