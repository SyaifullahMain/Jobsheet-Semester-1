package semseter1.pertemuan9;

import java.util.Scanner;
public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2;
        int counterLulus = 0;
        int jumlahMhs = 0;

        System.out.print("Masukan jumlah mahasiswa : ");
        jumlahMhs = sc.nextInt();
        nilaiMhs = new int[jumlahMhs];
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.printf("Masukan nilai mahasiswa ke-%d : ", i+1);
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                counterLulus++;
                continue;
            }
            totalTdkLulus += nilaiMhs[i];
        }
        rata2 = totalLulus/counterLulus;
        System.out.printf("Rata-rata nilai lulus = %.2f%n",rata2);
        rata2 = totalTdkLulus/(jumlahMhs-counterLulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.2f%n",rata2);
    }
}
