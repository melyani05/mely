
package com.mycompany.day98;

import java.util.Scanner;
public class Day98 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();

        if (nilai >= 60) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, Anda belum lulus. Perlu belajar lebih giat lagi.");
        }
    }
}
