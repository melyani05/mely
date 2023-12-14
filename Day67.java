
package com.mycompany.day67;


public class Day67 {

    public static void main(String[] args) {
       static ArrayList listBuah = new ArrayList();
       

        String nama = "Programku";

        // Fungsi
        public static void help() {
            System.out.println("Nama: " + nama);
            System.out.println("Versi: " + listBuah.get(0));
        }

        public static void tambahBuah(String buah) {
            listBuah.add(buah);
        }
    }
}
