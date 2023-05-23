package Servicos;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;

public class CalculaImposto {
    public static void caulculaImposto(Produto produto){
        System.out.println("Calcular Imposto do Tomate");
        double imposto = produto.calcularImposto();
        System.out.println("Nome"+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto a Ser Pago: " +imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate)produto).getDataDeValidade();
            System.out.println(dataValidade);
        }

    }
}