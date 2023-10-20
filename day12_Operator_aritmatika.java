package immayaa;

import java.util.Scanner;

public class day12_Operator_aritmatika {

    public static void main(String[] args) {
        Scanner kemeja = new Scanner(System.in);

        System.out.print("jumlah kemeja : ");
        int jumlahkemeja = kemeja.nextInt();
        System.out.print("jumlah kotak : ");
        int jumlahKotak = kemeja.nextInt();
        
        int kotak = jumlahkemeja / jumlahKotak;
        System.out.println("jumlah kotak yang terisi = " + jumlahKotak);
      
        kotak = jumlahkemeja % jumlahKotak;
        System.out.println("sisah kotak yang belum terkemas = " + kotak);

    }

}
