package one.digitalinnovation;

public class TransferenciaConta {

    public void transfere(Conta Conta, Conta contaDestino, int valor){
        if (valor<=0){
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }
    }
}
