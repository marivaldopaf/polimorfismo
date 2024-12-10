package edu.ifba.interface_exemplo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContaCorrente implements ContaInterface {
    private String numero;
    private double saldo;
    private double limiteChequeEspecial;

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando da conta corrente...");
        this.saldo = this.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando na conta conta corrente...");
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

}
