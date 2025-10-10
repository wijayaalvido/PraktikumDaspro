import java.util.Scanner;
public class nestedUjianSkripsi05 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak) : ");
    String bebasKompen = sc.nextLine() .trim();

    System.out.print("Masukkan jumlah log bilangan Pembimbing 1: ");
    int bimbinganP1 = sc.nextInt();
    System.out.print("Masukkan jumlah log bilangan Pembimbing 2: ");
    int bimbinganP2 = sc.nextInt();

    String pesan;

    if (bebasKompen.equalsIgnoreCase( "Ya")) {
        if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
        } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
            pesan = "Gagal! Log bimbingan Pembimbing 1 kurang dari 8 kali dan P2 kurang dari 4 kali.";
        } else if (bimbinganP1 <8) {
            pesan = "Gagal! Log bimbingan Pembimbing 1 belum mencapai 8 kali.";
        } else {
            pesan = "Gagal! Log bimbingan Pembimbing 2 belum mencapai 4 kali.";
        }
    } else {
        pesan = "Gagal! Mahasiswa belum bebas kompen.";
    }
    System.out.println (pesan);
    }
}