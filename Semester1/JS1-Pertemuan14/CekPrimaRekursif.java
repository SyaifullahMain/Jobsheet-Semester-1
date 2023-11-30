import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan: ");
        int n = sc.nextInt();
        String hasil = (cekPrimaRekursif(n)) ? "adalah" : "bukan";
        System.out.println(n + " " + hasil + " bilangan prima.");
    }
    static boolean cekPrimaRekursif(int n, int m) {
        if (n <= 1) return false;
        if (m == 1) return true;
        if (n % m == 0) return false;
        return cekPrimaRekursif(n, m - 1);
    }
    static boolean cekPrimaRekursif(int n) {
        return cekPrimaRekursif(n, n - 1);
    }
}
