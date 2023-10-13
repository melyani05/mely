
package day5;
import java.util.Scanner;

public class Day5 {

   
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan usia Anda: ");
            int usia = scanner.nextInt();
            
            System.out.println("Halo, " + nama + "! Anda berusia " + usia + " tahun.");
        } 
    }
    
}
