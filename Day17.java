
package day17;
import java.util.Scanner;


public class Day17 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (nilai >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
    
}
