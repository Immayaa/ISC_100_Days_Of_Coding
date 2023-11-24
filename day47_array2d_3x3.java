package immayaa;

import java.util.Scanner;

public class day47_Array2d_3x3 {
    public static void main(String[] args) {
        Scanner immaya = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Array 2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai untuk array2D[" + i + "][" + j + "]: ");
                a[i][j] = immaya.nextInt();
            }
            System.out.println();
        }

        System.out.println("Array 2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
