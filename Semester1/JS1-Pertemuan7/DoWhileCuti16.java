import java.util.Scanner;
public class DoWhileCuti16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi, bugss;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            bugss = sc.nextLine();
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            }
            else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Program selasai");
                break;
            }
        } while (jatahCuti > 0);
    }
}
