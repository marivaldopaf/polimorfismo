package edu.ifba.interface_exemplo1;

public class Teste {
    public static void main(String[] args) {
        //Boleto boleto = new Boleto();
        //boleto.efetuarPagamento();
        //boleto.emitirComprovante();

       //Cartao cartao = new Cartao();
       // cartao.efetuarPagamento();
        //cartao.emitirComprovante();

        //polimorfismo com interface
        PagamentoInterface pgt1 = new Boleto();
        pgt1.efetuarPagamento();
        pgt1.emitirComprovante();

        PagamentoInterface pgt2 = new Cartao();
        pgt2.efetuarPagamento();
        pgt2.emitirComprovante();
    }
}
