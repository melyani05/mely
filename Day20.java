
package day20;
import java.util.LinkedList;
import java.util.Queue;

public class Day20 {

    
    public static void main(String[] args) {
      Queue<String> queue = new LinkedList<>();
      
      
      queue.add("elemen 1");
      queue.add("elemen 2");
      queue.add("elemen 3");

      System.out.println("Isi queue: " + queue);
      
      String elemenPertama = queue.remove();
      System.out.println("Elemen yang dihapus: " + elemenPertama);
      
      System.out.println("Isi queue setelah penghapusan: " + queue);

    }
    
}
