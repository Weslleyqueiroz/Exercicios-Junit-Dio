package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarNoUsuarioWeslley(){
        Assumptions.assumeTrue("Weslley".equals(System.getenv("User")));
        Assertions.assertEquals(10,5+5);
    }
}
