import java.util.Scanner;
public class day17_if_else {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan jam : ");
        int jam = a.nextInt();

        if (jam >= 5.00 && jam <= 10.00) {
            System.out.println("Pagi");
        } else if (jam >= 11.00 && jam <= 13.00) {
            System.out.println("Siang");
        } else if (jam >= 14.00&& jam <= 18.00) {
            System.out.println("Soreh");
        } else if (jam >= 19.00 && jam <= 24.00) {
            System.out.println("Malam");
        } else if (jam >=01.00 && jam <= 4.00) {
            System.out.println("Dini hari");
        } else {
            System.out.println(" ");
        }     
    }
}
