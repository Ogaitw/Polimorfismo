package Teste;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;

public class teste02 {
    public static void main(String[] args) {


        Produto produto = new Computador("Ryzen 5", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Tomate("Tomate", 10, "20/02");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
