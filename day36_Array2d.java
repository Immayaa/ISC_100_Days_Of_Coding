package immayaa;

import java.util.Scanner;

public class day36_Array2d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = sc.nextInt();

        int[][] array2D = new int[jumlahBaris][jumlahKolom];
        int nilai = 1;

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                array2D[i][j] = nilai++;
            }
        }

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(array2D[i][j] +(" "));
            }
            System.out.println();
        }
    }
}
