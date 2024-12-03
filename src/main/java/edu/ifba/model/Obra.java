package edu.ifba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Obra {
    private int id;
    private String titulo;
    private String isbn;
    private double valor;

    public abstract boolean aplicarDesconto(double porcentagem);
    //if (porcentagem > 0.5) {
    System.out.println("Não é possível aplicar desconto maior de 50%");
    return false;            
}
double desconto = this.valor * porcentagem;
this.valor = valor - desconto;
return true;
}
        
}


