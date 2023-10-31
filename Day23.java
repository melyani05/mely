
package day23;
import java.util.LinkedList;
import java.util.Queue;

public class Day23 {

   
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        
        for (String element : queue) {
            System.out.println(element);
        }
        
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
    
}
