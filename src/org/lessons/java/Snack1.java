package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    /*
    *Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
     Se il numero è negativo termina.
    * */
    public static void main(String[] args) {
        //istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero: ");
            int numero = scan.nextInt();

            if (numero < 0) {
                System.out.println("Hai inserito un numero negativo. Game Over!");
                break; // Esci dal ciclo se il numero è negativo
            }

            if (numero % 2 == 0) {
                System.out.println("Il numero " + numero + " è pari.");
            } else {
                System.out.println("Il numero " + numero + " è dispari, il successivo è " + (numero + 1) + ".");
            }
        }
    }
}
