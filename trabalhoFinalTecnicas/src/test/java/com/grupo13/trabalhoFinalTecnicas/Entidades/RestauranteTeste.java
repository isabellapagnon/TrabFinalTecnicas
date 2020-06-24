package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.el.ListELResolver;
import org.junit.jupiter.api.Assertions;

@SpringBootTest

public class RestauranteTeste {
    @Test
        public void adicionarUmPratoNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Restaurante r = new Restaurante("Salvatore", "Comida Italiana", listaTeste);
            Prato prato = new Prato("Parmegiana", 30);
            r.addPrato(prato);
            Assertions.assertTrue(r.getPratos().contains(prato));
        }


    @Test
        public void adicionarDoisPratosNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Restaurante r = new Restaurante("Salvatore", "Comida Italiana", listaTeste);
            Prato prato = new Prato("Parmegiana", 30);
            Prato prato2 = new Prato("Feijoada", 50);
            r.addPrato(prato);
            r.addPrato(prato2);
            Assertions.assertTrue(r.getPratos().contains(prato) && r.getPratos().contains(prato2));
        }
}