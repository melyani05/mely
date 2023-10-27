
package day.pkg19;
import java.util.Stack;

public class Day19 {

    
    public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }  
    }
    
}
