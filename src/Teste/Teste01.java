package Teste;

import Servicos.CalculaImposto;
import dominio.Computador;
import dominio.Tomate;

public class Teste01 {
    public static void main(String[] args) {
        Computador computador = new Computador(" NUC101",    7000);
        Tomate tomate = new Tomate("Tomate Cereja", 10, "20/02");

        CalculaImposto.caulculaImposto(computador);
        CalculaImposto.caulculaImposto(tomate);
    }
}
