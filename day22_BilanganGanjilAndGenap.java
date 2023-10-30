package immayaa;
import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = a.nextInt();
         
        if (angka % 2 == 0) {
             int hasil = angka + 2;
              System.out.print( "ini adalah angka genap " + hasil);
        }
        else if (angka % 2 != 0) {
        	int hasil = angka + 1;
        	System.out.print("ini adalah angka genap " + hasil);
        }
        else {      
        System.out.println();
        }
    }
}
