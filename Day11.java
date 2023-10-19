
package day11;
import java.util.Stack;

public class Day11 {

    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    
}
