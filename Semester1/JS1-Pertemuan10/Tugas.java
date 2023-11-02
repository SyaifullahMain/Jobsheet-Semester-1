import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] dataMahasiswa;
        System.out.print("Masukan jumlah mahasisawa : ");
        int jumlahMahasiswa = input.nextInt();
        dataMahasiswa  = new String[jumlahMahasiswa][5];
        System.out.println();
        input.nextLine();
    
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Mahasiswa nomor urut ke-" + (i+1));
            System.out.print("Masukan NIM : ");
            dataMahasiswa[i][0] = input.nextLine();              
            System.out.print("Masukan Nama : ");
            dataMahasiswa[i][1] = input.nextLine();              
            System.out.print("Masukan Kelamin : ");
            dataMahasiswa[i][2] = input.nextLine();              
            System.out.print("Masukan Alamat : ");
            dataMahasiswa[i][3] = input.nextLine();              
            System.out.print("Masukan Kelas : ");
            dataMahasiswa[i][4] = input.nextLine();              
        }

        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa nomor urut ke-" + (i+1));
            System.out.println("NIM : " +dataMahasiswa[i][0]);
            System.out.println("Nama : " +dataMahasiswa[i][1]);
            System.out.println("kelamin : " +dataMahasiswa[i][2]);
            System.out.println("Alamat : " +dataMahasiswa[i][3]);
            System.out.println("Kelas : " +dataMahasiswa[i][4]);
        }
    }
}
