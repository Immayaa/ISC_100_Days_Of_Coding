package immayaa;

public class day38_Array_Multi_Dimensi {

    public static void main(String[] args) {
        int[][] angka = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }

}
