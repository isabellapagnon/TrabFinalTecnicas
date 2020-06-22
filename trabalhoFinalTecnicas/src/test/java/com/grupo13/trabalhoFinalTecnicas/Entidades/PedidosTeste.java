package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
// import java.lang.Throwable;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.List;
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
            Pedidos p = new Pedidos(0, null, 0.0, 0.0, "", "", "", "", null);
            Prato prato = new Prato("Parmegiana", 30);
            p.addPrato(prato);
            System.out.println((p.getPratos().toString() ));
        }



  

    
}