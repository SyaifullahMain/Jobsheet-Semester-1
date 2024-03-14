package semseter1.pertemuan4;

import java.util.Scanner;

public class Gaji_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, gaji, potGaji, TotGaji;
        System.out.println("Masukkan Besaran Gaji");
        gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji");
        potGaji = input.nextInt();
        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk = input.nextInt();
        TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
