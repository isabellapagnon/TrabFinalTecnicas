package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Respositorios;

import java.util.List;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPedido extends CrudRepository <Pedidos, Integer>{
    List<Pedidos> findById(int id);
}