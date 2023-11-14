package immayaa;

public class day37_operasi_array {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        int maksimum = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimum) {
                maksimum = angka[i];
            }
        }
        System.out.println("Nilai maksimum: " + maksimum);
    }
}
