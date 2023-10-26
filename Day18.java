
package day18;
import java.util.LinkedList;
import java.util.Queue;

public class Day18 {

    
    public static void main(String[] args) {
     Queue<String> queue = new LinkedList<>();
        queue.add("Melly");
        queue.add("Depi");
        queue.add("Adee");
        
        
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
        
        int size = queue.size();
        System.out.println("The size of the queue is " + size);
        
        String first = queue.peek();
        System.out.println("The first element in the queue is " + first);
        
        String removed = queue.remove();
        System.out.println("The first element removed from the queue is " + removed);
        
        if (queue.contains("Bob")) {
            System.out.println("The queue contains Bob.");
        } else {
            System.out.println("The queue does not contain Bob.");

    }
    
}
