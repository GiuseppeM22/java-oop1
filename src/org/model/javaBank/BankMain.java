package org.model.javaBank;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numeroConto;

        System.out.print("Benvetuto in Banca Italia, prego digiti il suo nome: ");
        String nome = scan.nextLine();

        // se il nome è valorizzato prosegui altrimenti annulla tutto
        if (!Objects.equals(nome, "")){
            numeroConto = random.nextInt(1000);
            BankAccount conto = new BankAccount(numeroConto, nome);
            System.out.println("benvenuto! " + conto.getNomeProprietario().toUpperCase() + " Ecco il suo numero del conto: " + conto.getNumeroConto());

            // metto la scelta delle opzioni in un do-while per ripetere tutto finche non venga digitato il numero 3
            int scelta = 0;
            do {
                // con il try catch controllo che non mi venga passato una stringa e mi sollevi l'eccezzione InputMismatchException
                try {
                    System.out.println();
                    System.out.println("Seleziona un'opzione:");
                    System.out.println("1. Opzione prelievo");
                    System.out.println("2. Opzione versamento");
                    System.out.println("3. Uscita");
                    System.out.print("Scelta: ");

                    scelta = scan.nextInt();

                    switch (scelta) {
                        case 1:
                            System.out.println();
                            System.out.println("Hai selezionato l'opzione prelievo. Prego digiti la somma da prelevare: ");
                            double prelievo = scan.nextDouble();
                            conto.prelievo(prelievo);
                            System.out.println("Richiesta di prelievo: " + prelievo + "." + " Ecco il tuo saldo! " + conto.getSaldo());
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Hai selezionato l'opzione versamento. Prego digiti la somma da versare:");
                            double versamento = scan.nextDouble();
                            conto.versamento(versamento);
                            System.out.println("Hai versato: " + versamento + "." + " Il suo saldo ammonta a: " + conto.getSaldo());
                            break;
                        case 3:
                            System.out.println("Arrivederci!");
                            break;
                        default:
                            System.out.println("Scelta non valida.");
                            break;
                    }
                //gestisco l'errore nel caso in cui l'input inserito dall'utente non sia un numero
                } catch (InputMismatchException e) {
                    System.out.println("Inserisci un numero valido. Riprova.");
                    scan.nextLine();
                }
            } while (scelta != 3);
        }else {
            System.out.println("Oops operazione annullata, riprovare!");
        }
    }
}
