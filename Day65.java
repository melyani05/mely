

package com.mycompany.day65;

import java.util.Stack;
public class Day65 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
    
        System.out.println("Elemen-elemen di stack: " + stack);
        System.out.println("Elemen teratas dari stack: " + stack.peek());
    
        stack.pop();
        System.out.println("Setelah menghapus satu elemen: " + stack);
    }
}
