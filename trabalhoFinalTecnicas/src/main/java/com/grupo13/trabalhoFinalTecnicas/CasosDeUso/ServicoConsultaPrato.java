package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Prato getDadosPrato(String nomePrato) {
        List<Prato> pratos = repositorioPrato.findByName(nomePrato);
        if (pratos.isEmpty()) {
            throw new IllegalArgumentException("Prato nao encontrado");
        } else {
            prato = pratos.get(0);
            return prato;
        }

    }

    public List<Prato> listarTodosPratos() {
        List<Prato> pratos = repositorioRestaurante.findAllPratos();
        return pratos;
    }

}
