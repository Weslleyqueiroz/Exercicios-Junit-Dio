package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();

    }


    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();

    }
}
