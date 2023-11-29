package immayaa;

import java.util.*;
import java.lang.String;

public class day52_RekursifPercabangan {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = sc.nextInt();
        System.out.println("Nilai Fibonacci ke-" + nilai + " adalah " + fibonacci(nilai));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
