import java.util.Scanner;
public class ternaryOperatorCetakKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat: ");
        int angka = sc.nextInt();
       
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil ");
        }
    }
}