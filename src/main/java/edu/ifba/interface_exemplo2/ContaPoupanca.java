package edu.ifba.interface_exemplo2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContaPoupanca implements ContaInterface {
    private String numero;
    private double saldo;
    private double juros;

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando da conta poupança...");
        this.saldo = this.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando na conta poupança...");
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

}

