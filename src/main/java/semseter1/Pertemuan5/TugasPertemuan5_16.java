package semseter1.Pertemuan5;

import java.util.Scanner;

public class TugasPertemuan5_16 {
    public static void main(String[] args) {
        
        Scanner input16 = new Scanner(System.in);
        System.out.print("Level anda (admin[1]/dosen[2]/mahasiswa[3]) : ");
        int level = input16.nextInt();
        if (level == 1) {
            System.out.println("Dashboard Admin");
        } else if (level == 2){
            System.out.println("Dashboard Dosen");
        } else if (level == 3) {
            System.out.println("Dashboard Mahasiswa");
        } else {
            System.out.println("Tidak ditemukan");
        }
        
    }
}
