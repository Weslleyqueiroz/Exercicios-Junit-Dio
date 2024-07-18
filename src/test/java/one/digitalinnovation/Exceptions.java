package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exceptions {

    @Test
    void  validarValor(){
      Conta conta=  new Conta("12345",0);
      Conta contaDestino = new Conta("321421",100);
        TransferenciaConta transferenciaConta = new TransferenciaConta();
        Assertions.assertThrows(IllegalArgumentException.class,()->
                transferenciaConta.transfere(conta,contaDestino,-1));
    }
}
