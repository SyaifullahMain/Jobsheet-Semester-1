import java.util.Scanner;

public class Bank16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, prosentase_bunga = .02;
        System.out.println("masukan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("masukan lama menabung anda");
        lama_menabung = input.nextInt();
        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        

        //########################################################//
        System.out.println("masukan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("masukan lama menabung anda");
        lama_menabung = input.nextInt();
        int jta = jml_tabungan_awal, lm = lama_menabung;


        // Menggunakan for
        for (int i = 0; i < lama_menabung; i++) {
            bunga = prosentase_bunga * jml_tabungan_awal;
            jml_tabungan_awal = (int)bunga + jml_tabungan_awal;
        }
        jml_tabungan_akhir = jml_tabungan_awal;
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);


        // Menggunkan while
        jml_tabungan_awal = jta;
        lama_menabung = lm;
        int i = 0;
        while (i < lama_menabung) {
            bunga = prosentase_bunga * jml_tabungan_awal;
            jml_tabungan_awal = (int)bunga + jml_tabungan_awal;
            i++;
        }
        jml_tabungan_akhir = jml_tabungan_awal;
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);


        //Menggunkan do while
        jml_tabungan_awal = jta;
        lama_menabung = lm;
        i = 0;
        do {
            bunga = prosentase_bunga * jml_tabungan_awal;
            jml_tabungan_awal = (int)bunga + jml_tabungan_awal;
            i++;
        } while (i < lama_menabung);
        jml_tabungan_akhir = jml_tabungan_awal;
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        //########################################################//
    }
}
