import java.util.Scanner;
public class aksesWIFI05 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sks;
    String pesan;

    System.out.println("--- Akses WIFI KAMPUS ---");
    System.out.print("Pilih jenis pengguna (Dosen/Mahasiswa): ");
    String jenisPengguna = sc.nextLine().trim();

    if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
        System.out.print("Masukkan jumlah SKS: ");
        sks = sc.nextInt();
        if (sks >= 12) {
            pesan = "Akses WIFI diizinkan untuk mahasiswa aktif";
        } else {
            pesan = "Akses WIFI ditolak, sks kurang dari 12";
        }
    } else if (jenisPengguna.equalsIgnoreCase("Dosen")) {
        pesan = "Akses WIFI diizinkan sebagai dosen";
    } else {
        pesan = "Akses ditolak";
    }

    System.out.println(pesan);
    }   
}