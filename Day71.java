

package com.mycompany.day71;

import java.util.Stack;

public class Day71 {

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Menambahkan elemen ke dalam stack
        stack.push("Contoh");
        stack.push("Program");
        stack.push("Stack");

        // Menampilkan elemen-elemen dalam stack
        System.out.println("Elemen-elemen di stack: " + stack);

        // Menghapus elemen dari stack
        stack.pop();

        // Menampilkan elemen setelah menghapus
        System.out.println("Setelah menghapus satu elemen: " + stack);
    }
}
