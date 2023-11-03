
package com.mycompany.day27;


public class Day27 {

    public static void main(String[] args) {
         int[] angka = {1, 2, 3, 4, 5};
        int jumlah = 0;
        double rata;

        for(int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        rata = jumlah / angka.length;

        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + rata);
    }
}
