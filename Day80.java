

package com.mycompany.day80;

import java.util.LinkedList;
import java.util.Queue;


public class Day80 {

    public static void main(String[] args) {
       Queue<String> mahasiswa = new LinkedList<>();
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Cici");
        System.out.println("Antrian Mahasiswa: " + mahasiswa);
        mahasiswa.remove();
        System.out.println("Antrian Mahasiswa setelah Andi keluar: " + mahasiswa);
    }
}
