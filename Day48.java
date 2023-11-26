
package com.mycompany.day48;


public class Day48 {

    public static void main(String[] args) {
        int[] nilai = {3, 6, 9, 12, 15}; 
        int sum = 0;
        int length = nilai.length;

        for (int i = 0; i < length; i++) {
            sum += nilai[i]; 
        }

        float rata_rata = (float)sum / (float)length;
        System.out.println("Rata-rata nilai: " + rata_rata);
    }
}
