package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
// import java.lang.Throwable;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.el.ListELResolver;

// import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class PedidosTeste {

    @Test
        public void setNumeroPedidoInvalido(){
            Pedidos p = new Pedidos(0, null, 0.0, 0.0, "", "", "", "", null);
            Assertions.assertThrows(IllegalArgumentException.class, () -> { p.setNumeroPedido(-38);
            });
        }
    @Test
        public void adicionarUmPratoNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Pedidos p = new Pedidos(0, listaTeste, 0.0, 0.0, "", "", "", "", null);
            Prato prato = new Prato("Parmegiana", 30);
            p.addPrato(prato);
            Assertions.assertTrue(p.getPratos().contains(prato));
        }


    @Test
        public void adicionarDoisPratosNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Pedidos p = new Pedidos(0, listaTeste, 0.0, 0.0, "", "", "", "", null);
            Prato prato = new Prato("Parmegiana", 30);
            Prato prato2 = new Prato("Feijoada", 50);
            p.addPrato(prato);
            p.addPrato(prato2);
            Assertions.assertTrue(p.getPratos().contains(prato) && p.getPratos().contains(prato2));
        }
  

    
}