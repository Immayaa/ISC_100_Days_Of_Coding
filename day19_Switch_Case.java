package immayaa;
import java.util.Scanner;
public class day19 {
    public static void main(String[] args) {
	   	
    	String sampah;
    	Scanner x = new Scanner(System.in);
		System.out.print("jenis sampah : ");
		sampah = x.next();

		switch (sampah) {
		case "organik":
			System.out.println("ya anda membuang sampah organik sesuai tempatnya");
			break;
		
		case "anorganik":
			System.out.println("ya anda membuang sampah anorganik sesuai tempatnya");
			break;
		default:
			 System.out.println("anda tdk membuang sampah sesuai jenisnya ");
		}
	}
}
