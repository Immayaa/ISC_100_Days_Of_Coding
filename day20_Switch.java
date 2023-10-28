package immayaa;
import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih bentuk geometri:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi Panjang");
        int pilihan = scanner.nextInt();
        double luas = 0;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                luas = sisiPersegi * sisiPersegi;
                break;
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                luas = 0.5 * alasSegitiga * tinggiSegitiga;
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                luas = Math.PI * jariJari * jariJari;
                break;
            case 4:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                luas = panjang * lebar;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }
        System.out.println("Luas bentuk geometri yang dipilih: " + luas);
        scanner.close();
    }
}
