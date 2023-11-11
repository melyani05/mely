

package com.mycompany.day34;


public class Day34 {

    public static void main(String[] args) {
     int[] nilai = {80, 70, 90, 75, 85};
        int total = 0;
        double rataRata;

        for(int i=0; i<nilai.length; i++) {
            total += nilai[i];
        }

        rataRata = total / (double)nilai.length;

        System.out.println("Nilai-nilai dalam array:");
        for(int i=0; i<nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai dalam array: " + rataRata);
    }
}
