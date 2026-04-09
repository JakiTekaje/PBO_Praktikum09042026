/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
Diagram Class :
    +-------------------------------------+
    |               AkunBank              |
    +-------------------------------------+
    | - noRekening : String               |
    | - namaNasabah : String              |
    | - saldo : double = 1000000          |
    +-------------------------------------+
    | + AkunBank(noRek, nama)             |
    | + getNoRekening() : String          |
    | + getNamaNasabah() : String         |
    | + getSaldo() : double               |
    | + deposit(jumlah: double) : void    |
    | + withdraw(jumlah: double) : void   |
    +-------------------------------------+
 */
package praktikum09042026;

import java.util.Scanner;

public class MainAkunBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan No Rekening : ");
        String noRek = input.nextLine();

        System.out.print("Masukkan Nama Nasabah: ");
        String nama = input.nextLine();

        AkunBank akun = new AkunBank(noRek, nama);

        int pilihan;
            
        System.out.println("\nMENU BANK");
        System.out.println("1. Lihat Data");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("No Rekening : " + akun.getNoRekening());
                System.out.println("Nama Nasabah: " + akun.getNamaNasabah());
                System.out.println("Saldo       : " + akun.getSaldo());
                break;
            case 2:
                System.out.print("Masukkan jumlah deposit: ");
                double deposit = input.nextDouble();
                akun.deposit(deposit);
                break;
            case 3:
                System.out.print("Masukkan jumlah withdraw: ");
                double withdraw = input.nextDouble();
                akun.withdraw(withdraw);
                break;
            case 4:
                System.out.println("Transaksi Sukses!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }   
    }
}
