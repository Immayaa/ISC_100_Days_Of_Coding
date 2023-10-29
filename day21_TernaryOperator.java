package immayaa;
import java.util.Scanner;
public class day21 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = a.nextInt();
        String hasil;
        hasil= (angka %2 == 0) ? "genap" : "ganjil";
        
        System.out.println("Angka ini adalah " + hasil);
    }
}
