

package com.mycompany.day39;


public class Day39 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nilai indeks ke-" + i + ": " + numbers[i]);
        }
    }
}
