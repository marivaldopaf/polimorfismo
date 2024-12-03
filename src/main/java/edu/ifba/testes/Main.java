package edu.ifba.testes;

import java.util.ArrayList;
import java.util.List;

import edu.ifba.model.Ebook;
import edu.ifba.model.Item;
import edu.ifba.model.Livro;
import edu.ifba.model.Pedido;

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        ebook.setId(1);
        ebook.setTitulo("Ebook java");
        ebook.setValor(100);
        ebook.setUrlMarcaDagua("https://ofuxico.com.br/wp-content/uploads/2024/07/Aya-Nakamura.jpg");
        ebook.setIsbn("10212451135135-6553");
        ebook.aplicarDesconto(0.1);

        Livro livro = new Livro();
        livro.setId(1);
        livro.setTitulo("Livro de HTML");
        livro.setValor(150);
        livro.setTiragem(200);
        livro.setIsbn("3211325 - 13232");
        livro.aplicarDesconto(0.5);

        Item item1 = new Item();
        item1.setObra(livro);
        item1.setQuantidade(2);

        Item item2 = new Item();
        item2.setObra(ebook);
        item2.setQuantidade(3);

        List<Item> listaItens = new ArrayList<>();
        listaItens.add(item1);
        listaItens.add(item2);

        Pedido pedido = new Pedido();
        pedido.setId(10);
        pedido.setItens(listaItens);

        for (Item item : listaItens) {
            System.out.println("===================");
            System.out.println("Título: "+item.getObra().getTitulo());
            System.out.println("Valor: "+item.getObra().getValor());
            System.out.println("Quantidade: "+item.getQuantidade());
            System.out.println("===================");
        }  
    }
}