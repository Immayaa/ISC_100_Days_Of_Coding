package immayaa;

public class day32_array {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        System.out.println("Jumlah elemen dalam array: " + total);
    }
}
