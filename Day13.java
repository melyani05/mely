
package day13;
import java.util.Scanner;

public class Day13 {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            if (numbers[i] > 10) {
                count++;
            }
        }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("There are " + count + " numbers greater than 10.");
    }
    
}
