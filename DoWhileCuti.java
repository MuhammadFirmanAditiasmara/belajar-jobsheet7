
import java.util.Scanner;

public class DoWhileCuti {

    public static void main(String[] args) {
        // Deklarasi variabel dan scanner
        Scanner scann = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scann.nextInt();
        // kode program
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scann.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scann.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
        scann.close();
    }
}
