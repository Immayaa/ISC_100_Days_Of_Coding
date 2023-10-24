package immayaa;
public class day16_switch {
	public static void main(String[] args) {
		
		System.out.print("jenis sampah : ");
		int jenissampahke =2;
		String sampah = (" ");
		switch (jenissampahke) {
			case 1:
			sampah ="organik";
			break;
		}
		switch (jenissampahke) {
			case 2:
			sampah ="Anorganik";
			break;
		}
		switch (jenissampahke) {
			case 3:
			sampah ="B3";
			break;
		}
			System.out.println(sampah);
	}
}
