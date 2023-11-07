import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa, nilai;
        int total, nilaiTertinggi, nilaiTerendah;

        System.out.print("Masukan jumlah Mahaiswa : ");
        jumlahMahasiswa = input.nextInt();
        int[] nilaiRata = new int[jumlahMahasiswa];
        System.out.println("=".repeat(50));
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukan nilai mahasiswa ke-" + (i + 1));
            total = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.printf("Masukan nilai ke-%d : ", j);
                nilai = input.nextInt();
                total += nilai;
                if (j == 3) {
                    total /= 3;
                    nilaiRata[i] = total;
                    System.out.printf("Rata-rata Mahasiswa ke-%d adalah %d%n", i+1, total);
                }
            }
            System.out.println("=".repeat(50));
        }
        nilaiTertinggi = nilaiRata[0];
        nilaiTerendah = nilaiRata[0];
        total = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiRata[i] > nilaiTertinggi) nilaiTertinggi = nilaiRata[i];
            if (nilaiRata[i] < nilaiTerendah) nilaiTerendah = nilaiRata[i];
            total += nilaiRata[i];
        }
        total /= jumlahMahasiswa;
        System.out.println("Nilai rata-rata tertinggi adalah : " + nilaiTertinggi);
        System.out.println("Nilai rata-rata terendah adalah : " + nilaiTerendah);
        System.out.println("Rata-rata nilai keseluruhan siswa : " + total);
    }
}
