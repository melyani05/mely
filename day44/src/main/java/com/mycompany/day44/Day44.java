
package com.mycompany.day44;


public class Day44 {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        
        double average = (double) sum / numbers.length;
        
         System.out.println("Rata-rata: " + average);


    }
}
