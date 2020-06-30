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
        Prato prato = new Prato("Parmegiana", 30, 1);
        p.addPrato(prato);
        Assertions.assertTrue(p.getPratos().contains(prato));
    }

    @Test
    public void adicionarTresPratosIguais() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Parmegiana", 30, 1);
        Prato prato3 = new Prato("Parmegiana", 30, 1);
        p.addPrato(prato);
        p.addPrato(prato2);
        p.addPrato(prato3);
        Assertions.assertEquals(3, p.getPratos().get(0).getQuantidade());
    }

    @Test
    public void adicionarDoisPratosNaLista() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Feijoada", 50, 1);
        p.addPrato(prato);
        p.addPrato(prato2);
        Assertions.assertTrue(p.getPratos().contains(prato) && p.getPratos().contains(prato2));
    }

    @Test
    public void calculaPrecoUmPrato() {
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Assertions.assertEquals(30, p.getPrecoPratos());
    }

@Test
    public void calculaPrecoDoisPratos() {
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Feijoada", 50, 1);
        listaTeste.add(prato);
        listaTeste.add(prato2);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "", "", "", "", null);
        Assertions.assertEquals(80, p.getPrecoPratos());
    }
}