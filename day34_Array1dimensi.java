package immayaa;

import java.util.Scanner;

public class day34_array1dimensi {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = a.nextInt();

        int[] arr = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = a.nextInt();
        }

        System.out.println("Elemen-elemen array yang dimasukkan:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
