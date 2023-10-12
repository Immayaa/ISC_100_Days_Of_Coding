
package immayaa;
import java.util.Scanner;


public class day4_inputan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("masukkan nama anda :");
        String nama = a.nextLine();
        
        System.out.print("masukkan nim anda :");
        String nim = a.nextLine();
        
        System.out.print("masukkan kelas anda :");
        String kelas = a.nextLine();
        
        System.out.println("NAMA   :"+ nama);
        System.out.println("NIM    :"+ nim);
        System.out.println("KELAS  :"+ kelas);
    }
    
}
