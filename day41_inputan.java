package immayaa;

import java.util.Scanner;

public class day41 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ima = a.nextInt();
        int[] array = new int[ima];
        double sum = 0;

        for (int i = 1; i <= ima; i++) {
            System.out.print("inputan" + i + ":");
            double num = a.nextDouble();
            sum += num;

        }

        double AVG = sum / ima;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + AVG);
    }
}
