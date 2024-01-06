

package com.mycompany.day90;

import java.util.Scanner;
public class Day90 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        // Mengambil input
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        // Menampilkan output
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
