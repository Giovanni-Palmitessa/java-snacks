package org.lessons.java;

import java.util.Random;

public class Snack2 {
    /*
    * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
    * */
    public static void main(String[] args) {
        //istanzio array dei nomi
        String[] names = {"Giovanni", "Francesco", "Giuseppe", "Chiara", "Federica", "Lucilla"};

        //istanzio array cognomi
        String[] surnames = {"Fresco", "Rosa", "Fisico", "Commercio", "Mezzo", "Alzi"};

        //istanzio la classe random
        Random rand = new Random();

        //calcolo lunghezza array di nomi e cognomi
        int nameLength = names.length;
        int surnameLength = surnames.length;

        for (int i = 0; i < names.length; i++) {
            int indexName = rand.nextInt(nameLength);
            int indexSurname = rand.nextInt(surnameLength);
        }
    }
}
