import java.util.Scanner;

public class ifElseCetakKRS05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Masukkan semester saat ini: ");
    int Semester = sc.nextInt();

    if (Semester == 1) {
        System.out.println("KRS semester 1 ditampilkan");
        } else if (Semester == 2) {
        System.out.println("KRS semester 2 ditampilkan");
        } else if (Semester == 3) {
        System.out.println("KRS semester 3 ditampilkan");
        } else if (Semester == 4) {
        System.out.println("KRS semester 4 ditampilkan");
        } else if (Semester == 5) {
        System.out.println("KRS semester 5 ditampilkan");
        } else if (Semester == 6) {
        System.out.println("KRS semester 6 ditampilkan");
        } else if (Semester == 7) {
        System.out.println("KRS semester 7 ditampilkan");
        } else if (Semester == 8) {
        System.out.println("KRS semester 8 ditampilkan");
        } else {
        System.out.println("Semester tidak valid, silahkan masukkan semester yang benar");
       
        }
    }    
}
