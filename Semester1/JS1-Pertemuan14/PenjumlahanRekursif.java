import java.util.Scanner;
public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);

        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah: " + hasil);

        System.out.println("Deret perhitungan penjumlahannya:");
        cetakDeretPenjumlahan(f);
    }
    // Fungsi rekursif untuk menghitung penjumlahan bilangan
    static int penjumlahanRekursif(int n) {
        return (n <= 0) ? 0 : n + penjumlahanRekursif(n - 1);
    }
    // Fungsi untuk mencetak deret perhitungan penjumlahan
    static void cetakDeretPenjumlahan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + penjumlahanRekursif(n));
    }
}
