

package com.mycompany.day76;

import java.util.Stack;
public class Day76 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        
        stack.push("Java");
        stack.push("C++");
        stack.push("Python");
        
        System.out.println("Elemen pada stack: " + stack);
        
        stack.pop();
        System.out.println("Elemen setelah pop: " + stack);

    }
}
