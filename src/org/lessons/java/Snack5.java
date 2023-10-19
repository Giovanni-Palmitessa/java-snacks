package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    /*
    * Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte. Possibile usare solo: cicli, chartAt, if /, switch
    * */
    public static void main(String[] args) {
    //istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        //chiedo all'utente di darmi un numero
        System.out.println("dammi un numero e te lo trasformo in un intero!");
        String numberString = scan.nextLine();

        int result = 0;

        // Ciclo per attraversare la stringa carattere per carattere
        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);

            if (digitChar >= '0' && digitChar <= '9') {
                int digit = digitChar - '0';
                result = result * 10 + digit;
            } else {
                System.out.println("Input non valido. Inserisci solo cifre.");
                return;
            }
        }

        // Stampa il risultato
        System.out.println("Numero intero: " + result);

        // Chiudere lo scanner
        scan.close();
    }
}
