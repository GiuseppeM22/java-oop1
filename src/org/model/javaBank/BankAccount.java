package org.model.javaBank;

import java.math.BigDecimal;

public class BankAccount {
    private Integer numeroConto;
    private String nomeProprietario;
    private double saldo;

    //costruttore
    public BankAccount() {
    }

    public BankAccount(Integer numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
    }

    //getter
    public double getSaldo() {
        return saldo;
    }
    public Integer getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    //metodi vari
    //versare soldi sul conto
    public double versamento(double soldiDaVersare){
        saldo += soldiDaVersare;
        return saldo;
    }

    //prelevare soldi sul conto
    public double prelievo(double soldiDaPrelevare) {
        if (saldo - soldiDaPrelevare >= 0) {
            saldo -= soldiDaPrelevare;
        } else {
            System.err.println("Fondi insufficienti per effettuare il prelievo. Massimo prelevabile: " + saldo);
        }
        return saldo;
    }
}
