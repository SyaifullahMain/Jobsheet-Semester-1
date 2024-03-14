package semseter1.pertemuan7;

import java.util.Scanner;
public class WhileGaji16 {
    public static void main(String[] args) {
        Scanner scan16 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan16.nextInt();
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukan jabatan Karyawan ke-" + (i+1) + ":");
            jabatan = scan16.next();
            System.out.print("Masukkan Jumlah Jam Lembur : ");
            jumlahJamLembur = scan16.nextInt();
            System.out.println(i);
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } 
            else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } 
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }
            else { // <----
                System.out.println("Jabatan tidak tersedia");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);
    }
}