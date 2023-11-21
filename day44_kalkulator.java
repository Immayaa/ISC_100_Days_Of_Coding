package immayaa;

import java.util.Scanner;

public class day44_kalkulator {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = a.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = a.nextInt();

        int hasilTambah = bilangan1 + bilangan2;
        int hasilKurang = bilangan1 - bilangan2;
        int hasilKali = bilangan1 * bilangan2;
        int hasilBagi = bilangan1 / bilangan2;

        System.out.println("Hasil Penambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);

    }

}
