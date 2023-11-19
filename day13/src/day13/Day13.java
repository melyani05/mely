
package day13;


public class Day13 {
        
    
       public static void main(String[] args) {
       
           int [] mely = {1,2,3,4,5};
           
           
           if (mely.length > 3) {
               System.out.println("array memiliki lebih dari 3 elemem ");
               
               
           } else {
               System.out.println("array memiliki 3 elemen atau kurang ");
           }
           
           for (int element : mely) {
               System.out.println(element);
           }
    }
    
}
