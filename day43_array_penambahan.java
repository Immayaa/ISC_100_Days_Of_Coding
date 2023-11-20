package immayaa;

import java.util.Scanner;

public class day43_array_penambahan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        int nilai = sc.nextInt();
        int hasil = 0;

        for (int i = 1; i <= nilai; i++) {
            hasil += i;

            System.out.print(i);
            if (i < nilai) {
                System.out.print(" + ");

            }

        }
        System.out.println(" = " + hasil);
    }
}

}
