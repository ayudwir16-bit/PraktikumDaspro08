import java.util.Scanner;
public class StudiKasus208 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         // Input data mahasiswa
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String kegiatan = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara : ");
        int peringkat = input.nextInt();

          System.out.print("Status : ");
        int status = input.nextInt();

               // Proses validasi
        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;

            System.out.println();
            System.out.println("Status : Dokumen tidak lengkap (kurang "
                    + kurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            boolean dapatPenghargaan = false;

            // Mengubah jenis kegiatan menjadi huruf besar
            kegiatan = kegiatan.toUpperCase();

            // Ketentuan BELMAWA, BAKORMA, dan MANDIRI
            if (kegiatan.equals("BELMAWA")
                    || kegiatan.equals("BAKORMA")
                    || kegiatan.equals("MANDIRI")) {

                if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                    dapatPenghargaan = true;
                }
                 } else if (kegiatan.equals("PKM")) {

                if (status == 1) {
                    dapatPenghargaan = true;
                }
            }

            // Lainnya tidak mendapat penghargaan
            if (dapatPenghargaan) {
                System.out.println();
                System.out.println("Status : Memenuhi ketentuan. Dana penghargaan diberikan.");
            } else {
                System.out.println();
                System.out.println("Status : Tidak memenuhi ketentuan. Dana penghargaan tidak diberikan.");
            }
        }

        input.close();
              

    }
    
}

