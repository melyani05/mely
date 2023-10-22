
package day14;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day14 {

   
    public static void main(String[] args) {
      Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        OUTER:
        while (true) {
            System.out.println("Enter a command (add, remove, peek, size, or exit):");
            input = scanner.nextLine();
            switch (input) {
                case "add" -> {
                    System.out.println("Enter a string to add to the queue:");
                    String toAdd = scanner.nextLine();
                    queue.add(toAdd);
                    System.out.println(toAdd + " added to the queue.");
              }
                case "remove" -> {
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        String removed = queue.remove();
                        System.out.println(removed + " removed from the queue.");
                    }
              }
                case "peek" -> {
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        String peeked = queue.peek();
                        System.out.println("The first element in the queue is " + peeked + ".");
                    }
              }
                case "size" -> System.out.println("The size of the queue is " + queue.size() + ".");
                case "exit" -> {
                    System.out.println("Exiting program.");
                    break OUTER;
              }
                default -> System.out.println("Invalid command.");
            }
        }
    }
    
}
