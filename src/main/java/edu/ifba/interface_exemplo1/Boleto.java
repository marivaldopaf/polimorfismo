package edu.ifba.interface_exemplo1;

public class Boleto implements PagamentoInterface {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento de boleto efetuado com sucesso!");
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Comprovante impresso com sucesso!");
    }

}
