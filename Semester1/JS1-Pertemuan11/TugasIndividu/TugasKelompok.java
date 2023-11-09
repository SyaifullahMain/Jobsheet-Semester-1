package TugasIndividu;

import java.util.Scanner;

public class TugasKelompok {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan jumlah mahasisawa : ");
    int jumlahMahasiswa = input.nextInt();
    String[][] dataMahasiswa  = new String[jumlahMahasiswa][5];
    String[] labelData = {"NIM", "Nama", "Kelamin", "Alamat", "Kelas"};
    System.out.println();
    input.nextLine();
    
    for (int i = 0; i < dataMahasiswa.length; i++) {
        System.out.println("Mahasiswa nomor urut ke-" + (i+1));
        for (int j = 0; j < dataMahasiswa[i].length; j++) {
            System.out.print("Masukan " + labelData[j] + " : ");
            dataMahasiswa[i][j] = input.nextLine();
        }          
        System.out.println();
    }
    System.out.println("=".repeat(50));
    for (int i = 0; i < dataMahasiswa.length; i++) {
        System.out.println("Data Mahasiswa nomor urut ke-" + (i+1));
        for (int j = 0; j < dataMahasiswa[i].length; j++) {
            System.out.printf("%s : %s%n", labelData[j], dataMahasiswa[i][j]);
        }
        System.out.println();
    }
  }
}
