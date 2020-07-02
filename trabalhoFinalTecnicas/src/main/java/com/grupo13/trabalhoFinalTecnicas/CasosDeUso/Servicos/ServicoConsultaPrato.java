package com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Servicos;

import com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Respositorios.RepositorioPrato;
import com.grupo13.trabalhoFinalTecnicas.CasosDeUso.Respositorios.RepositorioRestaurante;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoConsultaPrato {
    private RepositorioPrato repositorioPrato;
    private RepositorioRestaurante repositorioRestaurante;
    private Prato prato;

    @Autowired
    public ServicoConsultaPrato(RepositorioPrato repositorioPrato, RepositorioRestaurante repositorioRestaurante) {
        this.repositorioPrato = repositorioPrato;
        this.repositorioRestaurante = repositorioRestaurante;
        prato = null;
    }

    public Prato getDadosPrato(int id) {
        List<Prato> pratos = repositorioPrato.findById(id);
        if (pratos.isEmpty()) {
            throw new IllegalArgumentException("Prato nao encontrado");
        } else {
            prato = pratos.get(0);
            return prato;
        }

    }

    public List<Prato> listarTodosPratos() {
        List<Prato> pratos = repositorioRestaurante.findAll();
        return pratos;
    }

}
