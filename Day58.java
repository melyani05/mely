

package com.mycompany.day58;

import java.util.Arrays;


public class Day58 {

    public static void main(String[] args) {
      int[] nilai = {100};

      int[] angka = {1, 2, 3, 4, 5};

       int[] kosongan = new int[5];
       
       System.out.println("Array dengan satu elemen: " + Arrays.toString(nilai));
       System.out.println("Array dengan beberapa elemen: " + Arrays.toString(angka));
       System.out.println("Array dengan elemen yang sama: " + Arrays.toString(kosongan));

    }
}
