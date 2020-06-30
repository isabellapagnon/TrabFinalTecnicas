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

    
}