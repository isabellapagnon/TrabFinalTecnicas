package com.grupo13.trabalhoFinalTecnicas.Interfaces;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.grupo13.trabalhoFinalTecnicas.CasosDeUso.ServicoConsultaPedido;
import com.grupo13.trabalhoFinalTecnicas.CasosDeUso.ServicoConsultaPrato;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/consulta_no_restaurante")
public class ClienteFachadaRemota {
    private ServicoConsultaPedido servicoConsultaPedido;
    private ServicoConsultaPrato servicoConsultaPrato;

    @Autowired
    public ClienteFachadaRemota(ServicoConsultaPedido servicoConsultaPedido, ServicoConsultaPrato servicoConsultaPrato){
        this.servicoConsultaPedido = servicoConsultaPedido;
        this.servicoConsultaPrato = servicoConsultaPrato;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/dadosPedido")
    public Pedidos getDadosPedido(@RequestParam int numeroPedido){
        Pedidos pedido = servicoConsultaPedido.getDadosPedido(numeroPedido);
        return pedido;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/dadosPrato")
    public Prato getDadosPrato(String nomePrato){
        Prato prato = servicoConsultaPrato.getDadosPrato(nomePrato);
        return prato;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/todosPratos")
    public List<Prato> listarTodosPratos(){
        List<Prato> pratos = servicoConsultaPrato.listarTodosPratos();
        return pratos;
    }

    
}