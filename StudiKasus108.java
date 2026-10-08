import java.util.Scanner;

public class StudiKasus108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon = 0;
        int totalBayar;
        int kembalian;

        // Input jumlah cup dan uang yang dibayar
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = sc.nextInt();

         // Menghitung total harga
        totalHarga = jumlahCup * hargaPerCup;

         // Cek apakah mendapatkan diskon
         if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Menghitung total yang harus dibayar
        totalBayar = totalHarga - diskon;

        // Menampilkan hasil harga
        System.out.println("Total harga = " + totalHarga);
        System.out.println("Diskon = " + diskon);
        System.out.println("Total bayar = " + totalBayar);

           // Mengecek uang pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian = " + kembalian);
        } else {
            kembalian = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kembalian);
        }

        sc.close();
        
    }

}    