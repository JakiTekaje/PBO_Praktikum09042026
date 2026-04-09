/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum09042026;

import java.util.Scanner;

public class MainPersegiPanjangEnkapsulasi {

    public static void main(String[] args) {
        System.out.println("Banyak objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar(7);
        
        System.out.println("\nObjek 1 Menggunakan consctructor 1");
        System.out.println("Luas Persegi Panjang : "+pp1.getLuas());
        System.out.println("keliling Persegi Panjang : "+pp1.getKeliling());
        System.out.println("Banyak objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());     
        
        System.out.println("\nObjek 2 Menggunakan consctructor 2");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19,10);
        pp2.getLuas();
        pp2.getKeliling();
        System.out.println("Luas Persegi Panjang : "+pp1.getLuas());
        System.out.println("keliling Persegi Panjang : "+pp1.getKeliling());
        System.out.println("Banyak objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        System.out.println("\nObjek 3 Menggunakan constructor 2");
        System.out.println("Panjang dan Lebar di-input user");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Panjang = ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lebar = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(panjang,lebar);
        pp3.getLuas();
        pp3.getKeliling();
        System.out.println("Banyak objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
    }   
}
