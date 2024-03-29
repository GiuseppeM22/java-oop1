package org.model.javaShop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    //ATTRIBUTI
    private Integer codice;
    private String nome;
    private String descrizione;

    private BigDecimal prezzo;
    private Integer iva;

    //COSTRUTTORE
    public Product() {
        Random random = new Random();
        codice = random.nextInt(100000000);
    }

    public Product(String nome) {
        this.nome = nome;
    }

    public Product(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public Product(Integer codice, String nome, String descrizione, BigDecimal prezzo, Integer iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    //METODI GETTER
    public Integer getCodice() {
        return codice;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal getPrezzoConIva() {
        //iva al 22%
        BigDecimal iva = new BigDecimal("1.22");
        return prezzo.multiply(iva);
    }

    public String getNomeConIva() {
        Random random = new Random();
        codice = random.nextInt(100000000);
        String codiceFormattato = String.format("%08d", codice);
        return codiceFormattato + "-" + nome;
    }

}

