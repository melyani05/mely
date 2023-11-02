

package com.mycompany.day25;
import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        
        System.out.println("Angka yang dimasukkan: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nAngka yang habis dibagi 2: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
