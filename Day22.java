
package day22;
import java.util.Stack;


public class Day22 {

   
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    
}
