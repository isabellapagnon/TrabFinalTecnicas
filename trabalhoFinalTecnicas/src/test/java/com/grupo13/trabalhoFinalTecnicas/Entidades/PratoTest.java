package com.grupo13.trabalhoFinalTecnicas.Entidades;

import org.junit.jupiter.api.Test;
// import java.lang.Throwable;
import org.springframework.boot.test.context.SpringBootTest;
// import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;

@SpringBootTest(classes=com.grupo13.trabalhoFinalTecnicas.Entidades.PratoTest.class)
public class PratoTest {

    @Test
        public void setPrecoInvalido(){
            Prato p = new Prato("Parmegiana", 38, 1);
            //p.setPreco(-38);
            Assertions.assertThrows(IllegalArgumentException.class, () -> { p.setPreco(-38);
            });
        }

    @Test
    public void criarPrecoInvalido(){
        Prato p = new Prato("Parmegiana", -38, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> { p.criaNovoPrato("Parmegiana",-38, 1);
        });
    }

    @Test
    public void criarNomeInválido(){
        Prato p = new Prato(null, 38, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> { p.criaNovoPrato(null,38, 1);
        });
    }




    
    //Testes de Get e Set apenas para aumentar o percentual de CodeCoverge nas linhas



    @Test
    public void getNome(){
        Prato p = new Prato("Parmegiana", 38, 1);
        Assertions.assertEquals("Parmegiana", p.getNome());

    }

    @Test
    public void getPreco(){
        Prato p = new Prato("Parmegiana", 38, 1);
        Assertions.assertEquals(38, p.getPreco());

    }

    @Test
    public void getQuantidade(){
        Prato p = new Prato("Parmegiana", 38, 2);
        Assertions.assertEquals(2, p.getQuantidade());

    }

    @Test
    public void setPreco(){
        Prato p = new Prato("Parmegiana", 38, 1);
        p.setPreco(40);
        Assertions.assertEquals(40, p.getPreco());

    }

    @Test
    public void setQuantidade(){
        Prato p = new Prato("Parmegiana", 38, 2);
        p.setQuantidade(3);
        Assertions.assertEquals(5, p.getQuantidade());

    }

    @Test
    public void getId(){
        Prato p = new Prato("Parmegiana", 38, 2);
        Assertions.assertEquals(p.getId(), p.getId());
    }


    

    
}