package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.el.ListELResolver;
import org.junit.jupiter.api.Assertions;

@SpringBootTest(classes = com.grupo13.trabalhoFinalTecnicas.Entidades.RestauranteTeste.class)
public class RestauranteTeste {
    @Test
        public void adicionarUmPratoNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Restaurante r = new Restaurante("Salvatore", "Comida Italiana", listaTeste);
            Prato prato = new Prato("Parmegiana", 30, 1);
            r.addPrato(prato);
            Assertions.assertTrue(r.getPratos().contains(prato));
        }


    @Test
        public void adicionarDoisPratosNaLista(){
            List<Prato> listaTeste = new ArrayList<>();
            Restaurante r = new Restaurante("Salvatore", "Comida Italiana", listaTeste);
            Prato prato = new Prato("Parmegiana", 30, 1);
            Prato prato2 = new Prato("Feijoada", 50, 1);
            r.addPrato(prato);
            r.addPrato(prato2);
            Assertions.assertTrue(r.getPratos().contains(prato) && r.getPratos().contains(prato2));
        }




        //Testes de Get e Set apenas para aumentar o percentual de CodeCoverge nas linhas

        @Test
        public void getNome(){
            Restaurante rest = new Restaurante("nome", "especialidade", null);
            Assertions.assertEquals("nome", rest.getNome());
        }

        @Test
        public void getEspecialidade(){
            Restaurante rest = new Restaurante("nome", "especialidade", null);
            Assertions.assertEquals("especialidade", rest.getEspecialidade());
        }

        @Test
        public void setNome(){
            Restaurante rest = new Restaurante("nome", "especialidade", null);
            rest.setNome("nome2");
            Assertions.assertEquals("nome2", rest.getNome());
        }

        @Test
        public void setEspecialidade(){
            Restaurante rest = new Restaurante("nome", "especialidade", null);
            rest.setEspecialidade("especialidade2");
            Assertions.assertEquals("especialidade2", rest.getEspecialidade());
        }


}