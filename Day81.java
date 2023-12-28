

package com.mycompany.day81;


import java.util.Stack;

public class Day81 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Elemen paling atas: " + stack.peek());
        System.out.println("Menghapus elemen paling atas: " + stack.pop());
        System.out.println("Elemen paling atas setelah penghapusan: " + stack.peek());
    }
}
