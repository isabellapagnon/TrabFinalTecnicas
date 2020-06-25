package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

@SpringBootTest(classes = com.grupo13.trabalhoFinalTecnicas.Entidades.PedidosTeste.class)
public class PedidosTeste {

    @Test
    public void adicionarUmPratoNaLista() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Prato prato = new Prato("Parmegiana", 30);
        p.addPrato(prato);
        Assertions.assertTrue(p.getPratos().contains(prato));
    }

    @Test
    public void adicionarDoisPratosNaLista() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Prato prato = new Prato("Parmegiana", 30);
        Prato prato2 = new Prato("Feijoada", 50);
        p.addPrato(prato);
        p.addPrato(prato2);
        Assertions.assertTrue(p.getPratos().contains(prato) && p.getPratos().contains(prato2));
    }

}