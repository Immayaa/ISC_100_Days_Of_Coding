package immayaa;
public class day48_Fungsi_method{
	public static void main(String[] args) {
		int m, n;
		m = 25;
		n = jumlah(m);
		System.out.println("m = "+ m + " n = "+ n);
		
		m = 35;
		n = jumlah(m);
		System.out.println("m = "+ m + " n = "+ n);
		
		m= 45;
		n = jumlah(m);
		System.out.println("m = "+ m + " n = "+ n);
	}
	public static int jumlah(int input){
		int  hasil = input + input;
		return hasil;
	}
}
