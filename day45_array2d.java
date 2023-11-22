package immayaa;

public class day45_array2d {
    public static void main(String[] args) {
        int[][] matriks1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matriks2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int baris = matriks1.length;
        int kolom = matriks1[0].length;

        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
