package org.model.javaShop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //istanze
        BigDecimal prezzo = new BigDecimal(12.90);
        Product product = new Product();
        Product product2 = new Product(prezzo);
        Product product3 = new Product("Playstation");

        //stampe
        System.out.println("Codice prodotto: " + product.getCodice());
        System.out.println("Prezzo: " + product2.getPrezzo());
        System.out.println("Prezzo con iva: " + product2.getPrezzoConIva());
        System.out.println("Nome con codice: " + product3.getNomeConIva());




    }
}
