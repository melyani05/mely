
package com.mycompany.daay41;


public class Daay41 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println(numbers[0]); 
        System.out.println(numbers[2]);
        
        numbers[1] = 10;
        
        for (int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
        }
    }
}
