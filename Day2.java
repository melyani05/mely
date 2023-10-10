
package day2;
import java.util.Scanner;

public class Day2 {

   
    public static void main(String[] args) {
       Scanner Mely = new Scanner (System.in);
        System.out.println("Masukkan nama anda :");
        String nama = Mely.nextLine();
        System.out.println("Masukkan usia anda :");
        int usia = Mely.nextInt();
        System.out.println("Masukkan tingggi anda :");
        double tinggi = Mely.nextDouble();
        
        System.out.println("Nama anda :" + nama);
        System.out.println("Usia anda :" + usia);
        System.out.println("Tinggi anda :" + tinggi);
        
        Mely.close();
                
        
    }
    
}
