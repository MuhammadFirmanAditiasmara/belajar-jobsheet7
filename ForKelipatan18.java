
import java.util.Scanner;

/**
 * ForKelipatan18
 */
public class ForKelipatan18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0, total = 0;;
        System.out.print("Masukkan angka kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        scan.close();
    }
}
