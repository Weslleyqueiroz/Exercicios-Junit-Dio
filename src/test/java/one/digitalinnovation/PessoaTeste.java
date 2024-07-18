package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void devCalcularIdadeCorretamente (){

        Pessoa weslley = new Pessoa("Weslley", LocalDate.of(2004,9,27).atStartOfDay());
        Assertions.assertEquals(19,weslley.getIdade());
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa weslley = new Pessoa("Weslley", LocalDate.of(2004,9,27).atStartOfDay());
        Assertions.assertTrue(weslley.ehMaiorDeIdade());
    }
}

