package semseter1.pertemuan4;

import java.util.Scanner;

public class HargaBayar16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalBuku;
        String merkBuku;
        double dis=0.1, total, bayar, jmlDis;
        System.out.println("Masukan Merk Buku");
        merkBuku = input.nextLine();
        System.out.println("Masukan jumlah halaman buku");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukan harga barang yang dibeli");
        harga = input.nextInt();
        System.out.println("Masukan Jumlah jumlah barang yang dibeli");
        jumlah = input.nextInt();
        total  = harga * jumlah;
        jmlDis = total * dis;
        bayar  = total - jmlDis;
        System.out.println(merkBuku + " Jumlah halaman " + jmlHalBuku);
        System.out.println("Diskon yang anda dapatkan adalah "+jmlDis);
        System.out.println("Jumlah yang harus dibayarkan adalah "+bayar);
    }
}
