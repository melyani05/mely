
package day7;


public class Day7 {

    
    public static void main(String[] args) {
       int[] angka={1,2,3,4,5};
       System.out.println("isi array dengan angka :");
       
       for(int i=0;i<angka.length;i++) {
           System.out.println(angka[i] + "");
           
       }
       int total = 0;
       for (int i=0;i<angka.length;i++){
           total += angka[i];
       }
        System.out.println("/nTotal :" +total);
    }
    
}
