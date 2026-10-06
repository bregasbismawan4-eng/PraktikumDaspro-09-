import java.util.Scanner;

public class StudiKasus109 {
    
    public static void main(String[] args) {
        // Deklarasi variabel & Inisialisasi harga
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek syarat diskon (minimal total harga Rp100.000)
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung total bayar akhir
        totalBayar = totalHarga - diskon;

        // Tampilkan rincian pembayaran
        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        // Cek kecukupan uang pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    input.close();
}
}
