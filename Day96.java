
package com.mycompany.day96;


public class Day96 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int n = scanner.nextInt();
        int factorial = 1;
        
        do {
            factorial *= n;
            n--;
        } while (n > 0);

        System.out.println("Faktorialnya adalah: " + factorial);
    }
}
