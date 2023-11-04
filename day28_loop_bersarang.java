package immayaa;
public class day28_bintang_bersarang {
    public static void main(String[] args) {
        int jumlahBaris = 4;
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.print('*');
            }
        System.out.println();
        }
    }
}
