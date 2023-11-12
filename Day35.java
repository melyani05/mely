

package com.mycompany.day35;
import java.util.Stack;

public class Day35 {

    public static void main(String[] args) {
      String ekspresi = "3 4 + 5 *";
        String[] tokens = ekspresi.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
          switch (token) {
              case "+" ->                   {
                      int b = stack.pop();
                      int a = stack.pop();
                      stack.push(a + b);
                  }
              case "-" ->                   {
                      int b = stack.pop();
                      int a = stack.pop();
                      stack.push(a - b);
                  }
              case "*" ->                   {
                      int b = stack.pop();
                      int a = stack.pop();
                      stack.push(a * b);
                  }
              case "/" ->                   {
                      int b = stack.pop();
                      int a = stack.pop();
                      stack.push(a / b);
                  }
              default -> {
                  int angka = Integer.parseInt(token);
                  stack.push(angka);
              }
          }
        }
        
        System.out.println("Hasil: " + stack.pop());
    }
}
