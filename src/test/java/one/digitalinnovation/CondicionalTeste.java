package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionalTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "User", matches = "Weslley")
    void validarNoUsuarioWeslley() {

        Assertions.assertEquals(10, 5 + 5);
    }
}