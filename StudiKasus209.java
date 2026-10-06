import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        // Variabel untuk pengecekan
        int jumlahDokumen = 0;
        int peringkat = 0;
        int statusPKM = 0;

        // Cabang 1: Lomba (BELMAWA / BAKORMA / MANDIRI)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            peringkat = sc.nextInt();

            // Nested IF tingkat 2 & 3: Cek kelayakan juara dan dokumen
            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
            
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextInt();

            // Nested IF tingkat 2 & 3: Cek pendanaan dan dokumen
            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        // Cabang 3: LAINNYA
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
            sc.close();
    }
}
