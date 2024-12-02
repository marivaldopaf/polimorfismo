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
}
