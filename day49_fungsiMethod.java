package immayaa;

import java.util.Scanner;

public class day49_fungsiMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        double luas = hitungLuas(panjang, lebar);
        System.out.println("Luas persegi panjang: " + luas);

        gambarPersegiPanjang(panjang, lebar);
    }

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void gambarPersegiPanjang(double panjang, double lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
