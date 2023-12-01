package Immayaa;

public class day54_looping {

    public static void main(String[] args) {

        System.out.println("Menggunakan loop for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Menggunakan loop while:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("Menggunakan loop do-while:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
