
package day16;
import java.util.Stack;


public class Day16 {

   
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        
        
        int result = 0;
        while (!stack.isEmpty()) {
            char operator = getOperator();
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            switch (operator) {
                
            case '+' -> result = operand1 + operand2;
                case '-' -> result = operand1 - operand2;
                case '*' -> result = operand1 * operand2;
                case '/' -> result = operand1 / operand2;
                case '%' -> result = operand1 % operand2;
        }
            stack.push(result);
        }
        System.out.println("Result: " + stack.pop());
    }
    private static char getOperator() {
         return '+';
    }
}
