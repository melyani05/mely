
package day12;
import java.util.LinkedList;
import java.util.Queue;


public class Day12 {

   
    public static void main(String[] args) {
     Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        
        System.out.println("Queue: " + queue);
        String removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Updated Queue: " + queue);
    

    }
    
}
