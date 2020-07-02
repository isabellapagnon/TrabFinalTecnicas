package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Respositorios;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPrato extends CrudRepository<Prato, Integer>{
    List<Prato> findById(int id);

}