package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    /*
    * Data in input una stringa verificare se è palindroma
    * */
    public static void main(String[] args) {
        //istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        //chiedo all'utente una parola
        System.out.println("Dammi una parola e ti dirò se è palindroma: ");
        String word = scan.nextLine();

        //definisco la variabile della parola al contrario
        String reversedWord = "";

        //ciclo for per mettere la parola al contrario
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        //chiudo lo scan
        scan.close();
    }
}
