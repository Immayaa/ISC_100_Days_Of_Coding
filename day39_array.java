package immayaa;
import java.util.Scanner;
public class day39_array {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int x = a.nextInt();

        int[] array = new int[x];
        System.out.print("[");

        if (x % 2 == 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (i + 1) * 2;
            }
        } else {
           
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 2 + 1;
            }
        }

        for (int angka : array) {
            System.out.print(angka + " ");
        }
        System.out.print("]");
    }
}
