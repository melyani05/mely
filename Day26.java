
package com.mycompany.day26;


public class Day26 {

    public static void main(String[] args) {
      int[] array = new int[10];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;
        
        System.out.println("Elemen array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + array[i]);
        }
    }
    
}
