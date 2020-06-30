package com.grupo13.trabalhoFinalTecnicas.CasosDeUso;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

import com.grupo13.trabalhoFinalTecnicas.Entidades.FormasPagamento;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Pedidos;
import com.grupo13.trabalhoFinalTecnicas.Entidades.Prato;

import org.junit.jupiter.api.Assertions;

@SpringBootTest(classes = com.grupo13.trabalhoFinalTecnicas.CasosDeUso.CasosDeUsoTeste.class)

public class CasosDeUsoTeste {

    @Test
    public void testaPoliticaDescontoFalse() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        pedido.addPrato(prato);
        PoliticaDesconto p = new PoliticaDesconto();
        Assertions.assertEquals(false, p.desconto10(pedido));
    }

    @Test
    public void testaPoliticaDescontoTrue() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Feijoada", 50, 1);
        Prato prato3 = new Prato("Nhoque ao Molho Funghi", 45, 1);
        Prato prato4 = new Prato("Tortei de Ábobora", 40, 1);
        Prato prato5 = new Prato("Lasanha ao Molho Vermelho", 70, 1);
        Prato prato6 = new Prato("Lasanha ao Molho Quatro Queijos", 80, 1);
        pedido.addPrato(prato);
        pedido.addPrato(prato2);
        pedido.addPrato(prato3);
        pedido.addPrato(prato4);
        pedido.addPrato(prato5);
        pedido.addPrato(prato6);
        PoliticaDesconto p = new PoliticaDesconto();
        Assertions.assertEquals(true, p.desconto10(pedido));
    }
    
    @Test
    public void testaPoliticaFreteGratisTrue() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Feijoada", 50, 1);
        pedido.addPrato(prato);
        pedido.addPrato(prato2);
        PoliticaFrete p = new PoliticaFrete();
        Assertions.assertEquals(true, p.freteGratis(pedido));
    }

    @Test
    public void testaPoliticaFreteGratisFalse() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        pedido.addPrato(prato);
        PoliticaFrete p = new PoliticaFrete();
        Assertions.assertEquals(false, p.freteGratis(pedido));
    }

    @Test
    public void testaPoliticaCustoTotalSemFreteGratisSemDesconto() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        pedido.addPrato(prato);
        PoliticaCustoTotal p = new PoliticaCustoTotal();
        Assertions.assertEquals(45, p.custoTotal(pedido));
    }

    @Test
    public void testaPoliticaCustoTotalComFreteGratisSemDesconto() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Nhoque ao Molho Funghi", 45, 1);
        pedido.addPrato(prato);
        pedido.addPrato(prato2);
        PoliticaCustoTotal p = new PoliticaCustoTotal();
        Assertions.assertEquals(75, p.custoTotal(pedido));
    }

    @Test
    public void testaPoliticaCustoTotalComFreteGratisComDesconto() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Nhoque ao Molho Funghi", 45, 1);
        Prato prato3 = new Prato("Lasanha ao Molho Vermelho", 70, 1);
        pedido.addPrato(prato);
        pedido.addPrato(prato2);
        pedido.addPrato(prato3);
        PoliticaCustoTotal p = new PoliticaCustoTotal();
        Assertions.assertEquals(144,99, p.custoTotal(pedido));
    }

    @Test
    public void testaPoliticaPedidoMaximo() {
        List<Prato> listaTeste = new ArrayList<>();
        Pedidos pedido = new Pedidos(listaTeste, 0, 0, "", "", "", "", FormasPagamento.CARTÃO);
        Prato prato = new Prato("Parmegiana", 30, 1);
        Prato prato2 = new Prato("Parmegiana", 30, 1);
        Prato prato3 = new Prato("Parmegiana", 30, 1);
        Prato prato4 = new Prato("Parmegiana", 30, 1);
        Prato prato5 = new Prato("Parmegiana", 30, 1);
        Prato prato6 = new Prato("Parmegiana", 30, 1);
        pedido.addPrato(prato);
        pedido.addPrato(prato2);
        pedido.addPrato(prato3);
        pedido.addPrato(prato4);
        pedido.addPrato(prato5);
        pedido.addPrato(prato6);
        PoliticaPedidoMaximo p = new PoliticaPedidoMaximo();
        Assertions.assertThrows(IllegalArgumentException.class, () -> { p.verificarPedidoMaximo(pedido);
        });
    }
}