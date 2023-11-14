
package com.mycompany.day37;


public class Day37 {

    public static void main(String[] args) {
      int[] nilai = new int[5];
        nilai[0] = 80;
        nilai[1] = 70;
        nilai[2] = 90;
        nilai[3] = 85;
        nilai[4] = 75;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai siswa ke-" + (i+1) + ": " + nilai[i]);
        }
        
        int[][] matriks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                System.out.print(matrik[j] + " ");
            }
            System.out.println();
        }
    }
}
