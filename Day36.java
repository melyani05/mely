
package com.mycompany.day36;


public class Day36 {

    public static void main(String[] args) {
      int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] hasil = new int[5];
        
        for (int i = 0; i < array1.length; i++) {
            hasil[i] = array1[i] + array2[i];
        }
        
        System.out.println("Hasil penjumlahan array: ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}
