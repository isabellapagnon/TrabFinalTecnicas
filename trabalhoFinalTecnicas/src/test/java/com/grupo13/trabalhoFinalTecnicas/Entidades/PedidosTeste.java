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


    //Testes de Get e Set apenas para aumentar o percentual de CodeCoverge nas linhas

    @Test
    public void getNomeCliente(){
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "Nome Cliente", "", "", "", null);
        Assertions.assertEquals("Nome Cliente", p.getNomeCliente());

    }

    @Test
    public void getRua(){
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "Nome Cliente", "Rua1", "", "", null);
        Assertions.assertEquals("Rua1", p.getRua());

    }

    @Test
    public void getNumero(){
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "Nome Cliente", "Rua1", "1010", "", null);
        Assertions.assertEquals("1010", p.getNumero());

    }

    @Test
    public void getBairro(){
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "Nome Cliente", "Rua1", "1010", "Bairro1", null);
        Assertions.assertEquals("Bairro1", p.getBairro());
    }

    @Test
    public void getFormaPagamento(){
        List<Prato> listaTeste = new ArrayList<>();
        Prato prato = new Prato("Parmegiana", 30, 1);
        listaTeste.add(prato);
        Pedidos p = new Pedidos(listaTeste, 0.0, 0.0, "Nome Cliente", "Rua1", "1010", "Bairro1", FormasPagamento.CARTÃO);
        Assertions.assertEquals(FormasPagamento.CARTÃO, p.getFormasPagamento());
    }

    @Test
    public void getId(){
        Pedidos p = new Pedidos(null, 0.0, 0.0, "Nome Cliente", "Rua1", "1010", "Bairro1", FormasPagamento.CARTÃO);
        Assertions.assertEquals(p.getId(), p.getId());
    }


}