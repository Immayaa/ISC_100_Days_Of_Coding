package immayaa;
public class day40_SUMAVG {
    public static void main(String[] args) {
        int sum = 0;
        int AVG = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { 
            
                sum += i;
                AVG++;
            }
        }
        double hasil = sum / AVG;

        System.out.println("Jumlah bilangan ganjil: " + sum);
        System.out.println("Rata-rata bilangan ganjil: " + hasil);
    }
}
