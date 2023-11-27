package immayaa;
public class day50_SumAvg {
	public static void main(String[] args) {
		

        int sum = 0;
        int nilai = 0;

        System.out.print("Deretan 1 sampai 100: ");
        for (int i = 1; i <= 100; i++) {
            sum += i;
            nilai++;

            
            System.out.print(i + " ");
        }

        int avg = sum / nilai;

        System.out.println("Sum: " + sum);
        System.out.println("AVG: " + avg);
    }
}
