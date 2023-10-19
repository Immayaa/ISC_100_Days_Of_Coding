package immayaa;

import java.util.Scanner;

public class day11_Operator_logika {

    public static void main(String[] args) {
        Scanner BM = new Scanner(System.in);

        int salah = 9;
        int benar;
        boolean nilai;

        System.out.println("masukan nilai : ");
        benar = BM.nextInt();
        System.out.println("nilai tebakan anda :" + benar);

        nilai = (salah == benar);
        System.out.println("tebakan anda " + nilai);

        System.out.println("masukkan nilai di antara 1 dan 3");
        benar = BM.nextInt();
        
        nilai = (benar > 1) && (benar < 3);
        System.out.println("tebakan anda " + nilai);
    }

}
