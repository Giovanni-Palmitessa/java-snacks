package org.lessons.java;
public class Snack3 {
    /*
    * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    * */
    public static void main(String[] args) {

        //array di numeri interi
        int[] numbers = {1,4,65,33,87,11,98,24,11,87,12,10,59,43};

        //ciclo per stampare i numeri
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
