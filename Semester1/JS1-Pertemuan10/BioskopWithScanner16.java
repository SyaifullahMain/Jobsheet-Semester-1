import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;
        while (true) {
            System.out.print("Masukan nama: ");
            nama = input.nextLine();
            System.out.print("Masukan baris: ");
            baris = input.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = input.nextInt();
            input.nextLine();
            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            next = input.nextLine();
            if (next.equalsIgnoreCase("n")) break;
        }
    }
}
