
package com.mycompany.day69;

import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah hasil panen (dalam kg): ");
            double hasilPanen = input.nextDouble();
            
            System.out.print("Masukkan harga jual per kg: ");
            double hargaJual = input.nextDouble();
            
            double pendapatan = hasilPanen * hargaJual;
            System.out.println("Pendapatan dari hasil panen adalah: Rp " + pendapatan);
        }
    }
}
