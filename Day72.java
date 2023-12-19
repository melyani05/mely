

package com.mycompany.day72;

import java.util.Stack;

public class Day72 {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Contoh");
        stack.push("Program");
        stack.push("Stack");

        System.out.println("Elemen-elemen di stack: " + stack);
        System.out.println("Elemen teratas dari stack: " + stack.peek());
        stack.pop();
        System.out.println("Setelah menghapus satu elemen: " + stack);
    }
}
