

package com.mycompany.ggggg;

import java.util.Scanner;
public class Ggggg {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int input = scanner.nextInt();

        System.out.println("Output:");

        if (input % 2 != 0) {
            System.out.print("Bilangan ganjil yang dibawah " + input + " dan hasilnya dijumlahkan termasuk " + input + ": ");
            int sum = 0;
            for (int i = 1; i <= input; i += 2) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("\nTotal: " + sum);
        } else {
            System.out.print("Bilangan genap yang dibawah " + input + " dan hasilnya dijumlahkan termasuk " + input + ": ");
            int sum = 0;
            for (int i = 0; i <= input; i += 2) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("\nTotal: " + sum);
        }

        
    }
}
