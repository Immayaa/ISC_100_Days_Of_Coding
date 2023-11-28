package immayaa;
public class day51_rekursif {
    public static void Segitiga(int baris) {
        if (baris > 0) {
            Segitiga(baris - 1);
            for (int i = 0; i < baris; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int tinggiSegitiga = 5;
        Segitiga(tinggiSegitiga);
    }
}
