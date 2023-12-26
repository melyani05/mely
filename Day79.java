

package com.mycompany.day79;

import java.util.Stack;

public class Day79 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int topElement = stack.peek();
        System.out.println(topElement);
    }
}
