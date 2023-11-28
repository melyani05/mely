
package com.mycompany.day51;


public class Day51 {

    public static void main(String[] args) {
      int[] arr = {2, 4, 6, 8, 10};
      
      System.out.print("Isi array: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
        System.out.print("\nHasil operasi aritmatika: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] * 2 + " "); 
        }
    }
}
