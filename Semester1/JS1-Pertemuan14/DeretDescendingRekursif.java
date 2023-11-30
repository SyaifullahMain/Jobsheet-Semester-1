import java.util.Scanner;

public class DeretDescendingRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret Descending (Rekursif):");
        deretDescendingRekursif(n);

        System.out.println("\nDeret Descending (Iteratif):");
        deretDescendingIteratif(n);
    }
    // Fungsi rekursif untuk menampilkan deret descending
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    // Fungsi iteratif untuk menampilkan deret descending
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
