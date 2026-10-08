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

 
        input.close();
              

    }
    
}

