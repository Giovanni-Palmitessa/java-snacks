package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
    /*
    * Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
    * */
    public static void main(String[] args) {
        //istanziare lo scanner
        Scanner scan = new Scanner(System.in);

        //chiedere all'utente numero di secondi da trasformare
        System.out.println("Dammi il numero di secondi e te li trasformerò in ore, minuti e secondi:");
        int seconds = scan.nextInt();

        //chiudere lo scanner
        scan.close();
    }
}
