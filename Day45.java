
package com.mycompany.day45;


public class Day45 {

    public static void main(String[] args) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("Month 2 is " + month[1] + " days."); 
        
        
        String[] city = {"Jakarta", "Malang", "Surabaya", "Tokyo", "Manila", "Hongkong", "Tiongkok"};
      
        for (int i = 0; i < city.length; i++) {
            System.out.println((i + 1) + ". City " + city[i]); // Menampilkan semua isi array
        }
      
        System.out.println("\nMenampilkan City 4 adalah " + city[3]);
    }
}
