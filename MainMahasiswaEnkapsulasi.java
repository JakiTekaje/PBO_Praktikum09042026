/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum09042026;
import java.util.Scanner;
public class MainMahasiswaEnkapsulasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi();
        System.out.println("Nama pembuat program ini : "+mhs1.getNama1());
        System.out.println("Nim pembuat program ini : "+mhs1.getNim1());
        System.out.println("=================================================");
        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan  : ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Umur     : ");
        int umur = input.nextInt();
        System.out.print("Masukkan IPK      : ");
        double ipk = input.nextDouble();
        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi(nama, nim, jurusan, umur, ipk);
        mhs2.tampilInfo();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = input.nextDouble();
        mhs2.setIpk(ipkBaru);
        System.out.print("Masukkan umur baru:");
        int umurBaru = input.nextInt();
        mhs2.setUmur(umurBaru);
        mhs2.tampilInfo();
    }
}
