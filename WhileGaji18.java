
import java.util.Scanner;

public class WhileGaji18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jmlKaryawan, jmlJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jmlKaryawan = scan.nextInt();

        int i = 0;
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - direktur, Manajer, karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jam lembur: ");
            jmlJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = (jmlJamLembur * 100000);
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = (jmlJamLembur * 75000);
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji Lembur: " + totalGajiLembur);
        scan.close();
    }
}
