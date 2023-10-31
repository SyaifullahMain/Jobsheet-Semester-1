import java.util.Scanner;

public class PemilihanPercobaan2_16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.print("Nilai uas    : ");
        float uas = input16.nextFloat();
        System.out.print("Nilai uts    : ");
        float uts = input16.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input16.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input16.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String nilaiHuruf;
        if (80 < total && total <= 100) {
            nilaiHuruf = "A";    
        } else if (73 < total && total <= 80) {
            nilaiHuruf = "B+";
        } else if (65 < total && total <= 73) {
            nilaiHuruf = "B";
        } else if (60 < total && total <= 65) {
            nilaiHuruf = "C+";
        } else if (50 < total && total <= 60) {
            nilaiHuruf = "C";
        } else if (39 < total && total <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " nilai Huruf " + nilaiHuruf + " sehingga " + message);

    }
}
